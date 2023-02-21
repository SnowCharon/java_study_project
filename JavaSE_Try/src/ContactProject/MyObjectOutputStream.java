package ContactProject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author MOYU
 * @File JavaSE_Study-ContactProject
 * @Date 2022/6/12 15:35
 **/
public class MyObjectOutputStream extends ObjectOutputStream {
    public MyObjectOutputStream() throws IOException {
        super();
    }

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override

    protected void writeStreamHeader() throws IOException {
    }
}
