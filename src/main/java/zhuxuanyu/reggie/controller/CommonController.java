package zhuxuanyu.reggie.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import zhuxuanyu.reggie.common.Result;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * @title: CommonController
 * @Author 竹玄羽
 * @Date: 2023/2/18 14:52
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/common")
public class CommonController {
    @Value("${reggie.path}")
    private String basePath;

    /**
     * 上传方法
     * @param file 文件
     * @return 返回文件名
     */
    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) {
        //file是临时文件，需要转存，否则本次请求完成后就会被删除
        log.info(file.toString());

        //原始文件名
        String originalFilename = file.getOriginalFilename();
        if (originalFilename == null) {
            return null;
        }
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        //防止重名覆盖，用UUID
        String filename = UUID.randomUUID() + suffix;

        //检查目录是否存在
        Path path = Paths.get(basePath);
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //转存临时文件
        try {
            file.transferTo(new File(basePath + filename));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return Result.success(filename);
    }

    /**
     * 下载
     * @param name 文件名
     * @param response 响应
     */
    @GetMapping("/download")
    public void download(String name, HttpServletResponse response) {
        Path filePath = Paths.get(basePath).resolve(name);

        if (Files.exists(filePath)) {
            try (FileInputStream fileInputStream = new FileInputStream(filePath.toFile());
                 ServletOutputStream outputStream = response.getOutputStream()) {

                response.setContentType(Files.probeContentType(filePath));

                int len = 0;
                byte[] bytes = new byte[1024];
                while ((len = fileInputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, len);
                    outputStream.flush();
                }
            } catch (IOException e) {
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                e.printStackTrace();
            }
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}
