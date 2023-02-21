package ContactProject;

import java.io.*;
import java.util.*;

/**
 * @author MOYU
 * @File JavaSE_Study-ContactProject
 * @Date 2022/6/12 9:12
 **/
public class Command {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        //创建File
        File file = new File("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_Try\\src\\ContactProject\\Contact.txt");
        //创建对象操作流
        ObjectOutputStream objectOutputStream;
        if (file.isFile()){
            objectOutputStream = new MyObjectOutputStream(new FileOutputStream(file,true));
        }else{
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file,true));
        }

        int chose;
        OUT:
        while (true) {
            //控制台
            System.out.println("==============================");
            System.out.println("请输入您的操作指令：");
            System.out.println("0:退出通讯录");
            System.out.println("1:新建联系人");
            System.out.println("2:删除联系人");
            System.out.println("3.修改联系人");
            System.out.println("4.查询指定的联系人");
            System.out.println("5.展示通讯录--需要权限访问");
            System.out.println("==============================");

            //控制命令
            try {
                chose = scanner.nextInt();
            } catch (InputMismatchException e) {
                String rubbish = scanner.next();
                System.out.println("请输入正确的指令格式：");
                continue;
            }
            switch (chose) {
                case 0:
                    break OUT;
                case 1:
                    storeContact(objectOutputStream, scanner);
                    System.out.println("退出成功！");
                    break;
                case 2:
                    deleteContact(objectOutputStream, scanner);
                    break;
                case 3:
                    updateContact(file, scanner);
                    break;
                case 4:
                    searchContact(file, scanner);
                    break;
                case 5:
                    showContact();
                    break;
                default:
                    System.out.println("好耶！");
            }
        }
        System.out.println("程序结束！");
        objectOutputStream.close();
    }

    private static void showContact() throws IOException, ClassNotFoundException {

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_Try\\src\\ContactProject\\Contact.txt"));
            HashMap<Integer, Contact> hm = (HashMap<Integer, Contact>) objectInputStream.readObject();
            Set<Integer> keys = hm.keySet();
            for (Integer key : keys) {
                Contact people = hm.get(key);
                System.out.println("第" + key + "位联系人：" + people);
            }
        } catch (EOFException e) {
            System.out.println("通讯录为空！");
        }
    }


    private static void searchContact(File file, Scanner scanner) {
    }

    private static void updateContact(File file, Scanner scanner) throws IOException, ClassNotFoundException {
        System.out.println("请输入要修改人在通讯录的序号（如果遗忘可输入Y选择查看）：");
        String ch = scanner.next();
        if("Y".equals(ch)){
            showContact();
        }else{
            System.out.println("请输入新的联系人信息：");
        }
    }

    private static void deleteContact(ObjectOutputStream objectOutputStream, Scanner scanner) throws IOException, ClassNotFoundException {
        System.out.println("请输入被删除人在通讯录的序号（如果遗忘可输入Y选择查看）：");
        String ch = scanner.next();
        if("Y".equals(ch)){
            showContact();
        }else{
            System.out.println("请输入被删除联系人序号：");
            int index = scanner.nextInt();
            objectOutputStream.reset();
        }
    }

    private static void storeContact(ObjectOutputStream objectOutputStream, Scanner scanner) throws IOException {


        //使用HashMap存储联系人，存入联系人的次序作为key
        HashMap<Integer, Contact> hm = new HashMap<>(100);
        int index = 0;

        while (true) {
            //提醒用户输入数据,将新建联系人对象存储进文件
            System.out.println("请输入新建联系人的姓名：");
            String name = scanner.next();
            System.out.println("请输入新建联系人的手机号码：");
            String phone = scanner.next();
            System.out.println("请输入对新建联系人的备注：");
            String remark = scanner.next();
            Contact people = new Contact(name, phone, remark);
            hm.put(++index, people);

            objectOutputStream.writeObject(hm);

            //刷新数据后提醒用户添加成功
            objectOutputStream.flush();
            System.out.println("添加成功！");

            //询问是否退出
            System.out.println("如果需要退出新建联系人，请输入0，不需要请按除0以外的任意键");
            int exit;
            try {
                exit = scanner.nextInt();
                if (exit == 0) {
                    break;
                }
            } catch (InputMismatchException ignored) {
                String rubbish = scanner.next();
                System.out.println("继续操作");
            }
        }
    }
}
