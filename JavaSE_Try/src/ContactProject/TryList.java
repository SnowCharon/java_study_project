package ContactProject;

import java.io.*;
import java.util.*;

/**
 * @author MOYU
 * @File JavaSE_Study-ContactProject
 * @Date 2022/6/12 20:06
 **/
public class TryList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建ArrayList集合以及扫描器
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> list = new ArrayList<>();

        OUT:
        while (true) {
            File file = new File("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_Try\\src\\ContactProject\\Contact.txt");
            ObjectOutputStream objectOutputStream = null;
            if (file.isFile()) {
                objectOutputStream = new MyObjectOutputStream(new FileOutputStream(file, true));
            } else {
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
                    storeContact(scanner,list);
                    System.out.println("退出成功！");
                    break;
                case 2:
                    deleteContact( list,scanner);
                    break;
                case 3:
                    updateContact(list, scanner);
                    break;
                case 4:
                    searchContact(list, scanner);
                    break;
                case 5:
                    showContact(list);
                    break;
                default:
                    System.out.println("好耶！");
            }
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        }

    }

    private static void searchContact(ArrayList<Contact> list, Scanner scanner) {
        Iterator<Contact> it = list.iterator();
        while (true) {
            ArrayList<Contact> array = new ArrayList<>();
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
                    int number = scanner.nextInt();
                    System.out.println(array.get(number));
                    break;
                case 2:
                    System.out.println("请输入要查找的姓名");
                    String myName = scanner.next();

                   while (it.hasNext()){
                       String name = it.next().getName();
                       if (Objects.equals(name, myName)){
                           array.add(it.next());
                       }
                   }
                    break;

                case 3:
                    System.out.println("请输入要查找的电话号码");
                    String myPhone = scanner.next();
                    while (it.hasNext()){
                        String phone = it.next().getPhone();
                        if (Objects.equals(phone, myPhone)){
                            array.add(it.next());
                        }
                    }
                    break;

                case 4:
                    System.out.println("请输入要查找的电话号码");
                    String myRemark = scanner.next();
                    while (it.hasNext()){
                        String remark = it.next().getRemark();
                        if (Objects.equals(remark, myRemark)){
                            array.add(it.next());
                        }
                    }
                    break;

                default:
                    System.out.println("输入错误！");
            }
            System.out.println("根据给出线索找到如下联系人：");
            System.out.println(array.toString());
        }
    }

    private static void updateContact(ArrayList<Contact> list, Scanner scanner) throws IOException, ClassNotFoundException {
        System.out.println("请输入要修改人在通讯录的序号（如果遗忘可输入Y选择查看）：");
        String ch = scanner.next();
        if ("Y".equals(ch)) {
            showContact(list);
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
        list.add(index,people);
        System.out.println("修改成功！");
        showContact(list);
    }

    private static void deleteContact(ArrayList<Contact> list, Scanner scanner) throws IOException, ClassNotFoundException {
        System.out.println("请输入要修改人在通讯录的序号（如果遗忘可输入Y选择查看）：");
        String ch = scanner.next();
        if ("Y".equals(ch)) {
            showContact(list);
        }
        System.out.println("请输入被删除联系人的序号：");
        int index = scanner.nextInt();
        list.remove(index);
        System.out.println("删除成功！");
        showContact(list);
    }

    private static void showContact(ArrayList<Contact> list) throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\JAVA\\Code\\JavaSE_Study\\JavaSE_Try\\src\\ContactProject\\Contact.txt"));
           ArrayList<Contact> arrayList = (ArrayList<Contact>) objectInputStream.readObject();
           int index = 0;
            for (Contact contact : arrayList) {
                String name = contact.getName();
                String phone = contact.getPhone();
                String remark = contact.getRemark();
                System.out.println("第" + index++ + "位联系人：{" + name +  " 电话：" + phone + " 备注：" + remark);
            }
            /*for (Contact contact : arrayList) {
                System.out.println(contact);
            }*/

            objectInputStream.close();

            objectInputStream.close();
        } catch (StreamCorruptedException e) {
            System.out.println("StreamCorruptedException触发！");
        } catch (IndexOutOfBoundsException e){
            System.out.println("通讯录为空！");
        } catch (EOFException e) {
            System.out.println("通讯录为空！");
        }
    }

    private static void storeContact(Scanner scanner, ArrayList<Contact> list) {
        while (true) {
            //提醒用户输入数据,将新建联系人对象存储进集合
            System.out.println("请输入新建联系人的姓名：");
            String name = scanner.next();
            System.out.println("请输入新建联系人的手机号码：");
            String phone = scanner.next();
            System.out.println("请输入对新建联系人的备注：");
            String remark = scanner.next();
            Contact people = new Contact(name, phone, remark);
            list.add(people);

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
