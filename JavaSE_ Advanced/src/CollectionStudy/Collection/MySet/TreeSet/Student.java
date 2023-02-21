package CollectionStudy.Collection.MySet.TreeSet;

/**
 * @author MOYU
 * @File JavaSE_Study-Collection_Study.MySet.TreeSet
 * @Date 2022/6/5 1:15
 **/
public class Student implements Comparable<Student> {
    private String name;
    private int Chinese;
    private int Math;
    private int English;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                '}' + getSum() + "\n";
    }

    public int getSum() {
        return Chinese + Math + English;
    }

    @Override
    public int compareTo(Student o) {
        //总成绩排名
        int result = o.getSum() - this.getSum();
        //总成绩一样，语文排名
        result = result == 0 ? o.getChinese() - this.getChinese() : result;
        //语文一样，数学排名
        result = result == 0 ? o.getMath() - this.getMath() : result;
        //数学一样，英语排名
        result = result == 0 ? o.getEnglish() - this.getEnglish() : result;
        //英语一样，姓名排名
        result =  result == 0 ? o.name.compareTo(this.getName()) : result;
        return result;
    }
}
