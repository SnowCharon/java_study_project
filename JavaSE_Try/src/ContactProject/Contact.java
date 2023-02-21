package ContactProject;

import java.io.Serializable;

/**
 * @author MOYU
 * @File JavaSE_Study-ContactProject
 * @Date 2022/6/12 9:09
 **/
public class Contact implements Serializable {
    private static final long serialVersionUID = 1521525336376765756L;

    private String name;
    private String phone;
    private String remark;

    public Contact() {
    }

    public Contact(String name, String phone, String remark) {
        this.name = name;
        this.phone = phone;
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
