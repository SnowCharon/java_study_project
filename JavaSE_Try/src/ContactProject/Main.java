package ContactProject;

import java.io.*;
import java.util.*;

/**
 * @author MOYU
 * @File JavaSE_Study-ContactProject
 * @Date 2022/6/12 16:55
 **/
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建HashMap集合以及扫描器
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Contact> hm = new HashMap<>();
        int index = 0;

        OUT:
        while (true) {
            File file = new File("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_Try\\src\\ContactProject\\Contact.txt");
            ObjectOutputStream objectOutputStream = null;
            if(file.isFile()){
                objectOutputStream = new MyObjectOutputStream(new FileOutputStream(file,true));
            }else{
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true));
            }

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

            int chose;
            try {
                chose = scanner.nextInt();
            } catch (InputMismatchException e) {
                String rubbish = scanner.next();
                System.out.println("请输入正确的指令格式：");
                continue;
            }
            switch (chose) {
                //控制命令


                case 0:
                    break OUT;
                case 1:
                    storeContact(scanner, hm, index);
                    System.out.println("退出成功！");
                    break;
                case 2:
                    deleteContact(hm, scanner);
                    break;
                case 3:
                    updateContact(hm, scanner);
                    break;
                case 4:
                    searchContact(hm, scanner);
                    break;
                case 5:
                    showContact(hm);
                    break;
                default:
                    System.out.println("好耶！");
            }
            objectOutputStream.writeObject(hm);
           objectOutputStream.close();
        }

    }

    private static void searchContact(HashMap<Integer, Contact> hm, Scanner scanner) {
        Set<Map.Entry<Integer, Contact>> entries = hm.entrySet();
        while (true) {
            ArrayList<Contact> list = new ArrayList<>();
            System.out.println("请选择通过何种方式查找：");
            System.out.println("-------------");
            System.out.println("0.退出");
            System.out.println("1.序号");
            System.out.println("2.姓名");
            System.out.println("3.电话号码");
            System.out.println("4.备注");
            System.out.println("-------------");
            int chose = scanner.nextInt();
            switch (chose) {
                case 0:
                    return;
                case 1:
                    System.out.println("请输入要查找的序号：");
                    Integer number = scanner.nextInt();
                    System.out.println(hm.get(number));
                    break;
                case 2:
                    System.out.println("请输入要查找的姓名");
                    String myName = scanner.next();
                    for (Map.Entry<Integer, Contact> entry : entries) {
                        String name = entry.getValue().getName();
                        if (myName.equals(name)) {
                            list.add(entry.getValue());
                        }
                    }
                    System.out.println("根据给出线索找到如下联系人：");
                    System.out.println(list.toString());
                    break;

                case 3:
                    System.out.println("请输入要查找的电话号码");
                    String myPhone = scanner.next();
                    for (Map.Entry<Integer, Contact> entry : entries) {
                        String phone = entry.getValue().getPhone();
                        if (myPhone.equals(phone)) {
                            list.add(entry.getValue());
                        }
                    }
                    System.out.println("根据给出线索找到如下联系人：");
                    System.out.println(list.toString());
                    break;

                case 4:
                    System.out.println("请输入要查找的电话号码");
                    String myRemark = scanner.next();
                    for (Map.Entry<Integer, Contact> entry : entries) {
                        String remark = entry.getValue().getRemark();
                        if (myRemark.equals(remark)) {
                            list.add(entry.getValue());
                        }
                    }
                    System.out.println("根据给出线索找到如下联系人：");
                    System.out.println(list.toString());
                    break;

                default:
                    System.out.println("输入错误！");
            }
        }
    }

    private static void updateContact(HashMap<Integer, Contact> hm, Scanner scanner) throws IOException, ClassNotFoundException {
        System.out.println("请输入要修改人在通讯录的序号（如果遗忘可输入Y选择查看）：");
        String ch = scanner.next();
        if ("Y".equals(ch)) {
            showContact(hm);
        }
        System.out.println("请输入联系人序号：");
        int index = scanner.nextInt();
        System.out.println("请输入联系人的姓名：");
        String name = scanner.next();
        System.out.println("请输入联系人的手机号码：");
        String phone = scanner.next();
        System.out.println("请输入对联系人的备注：");
        String remark = scanner.next();
        Contact people = new Contact(name, phone, remark);
        hm.put(index, people);
        System.out.println("修改成功！");
        showContact(hm);
    }

    private static void deleteContact(HashMap<Integer, Contact> hm, Scanner scanner) throws IOException, ClassNotFoundException {
        System.out.println("请输入要修改人在通讯录的序号（如果遗忘可输入Y选择查看）：");
        String ch = scanner.next();
        if ("Y".equals(ch)) {
            showContact(hm);
        }
        System.out.println("请输入被删除联系人的序号：");
        int index = scanner.nextInt();
        hm.remove(index);
        System.out.println("删除成功！");
        showContact(hm);
    }

    private static void showContact(HashMap<Integer, Contact> hm) throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_Try\\src\\ContactProject\\Contact.txt"));
            HashMap<Integer, Contact> map = (HashMap<Integer, Contact>) objectInputStream.readObject();
            Set<Map.Entry<Integer, Contact>> entries = map.entrySet();
            for (Map.Entry<Integer, Contact> entry : entries) {
                Integer key = entry.getKey();
                Contact value = entry.getValue();
                System.out.println("第" + key + "位联系人：" + value);
            }
            objectInputStream.close();
        } catch (StreamCorruptedException e) {
            System.out.println("StreamCorruptedException触发！");
        } catch (EOFException e) {
            System.out.println("通讯录为空！");
        }
    }

    private static void storeContact(Scanner scanner, HashMap<Integer, Contact> hm, int index) {
        while (true) {
            //提醒用户输入数据,将新建联系人对象存储进集合
            System.out.println("请输入新建联系人的姓名：");
            String name = scanner.next();
            System.out.println("请输入新建联系人的手机号码：");
            String phone = scanner.next();
            System.out.println("请输入对新建联系人的备注：");
            String remark = scanner.next();
            Contact people = new Contact(name, phone, remark);
            hm.put(++index, people);

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

