package ObjectOriented.Extends;

/**
 * @author 竹玄羽
 * @File Extends
 * @date 2022/5/23  15:15
 **/
public class Teacher extends People {
    private String className;

    public void teach(){
        System.out.println(getClassName() + "的" + "老师" + getName() + "教书。");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
