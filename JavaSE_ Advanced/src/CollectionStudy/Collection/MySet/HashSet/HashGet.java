package CollectionStudy.Collection.MySet.HashSet;

/**
 * @author MOYU
 * @File JavaSE_Study-CollectionStudy.MySet.HashSet
 * @Date 2022/6/5 14:53
 **/
public class HashGet {
    public static void main(String[] args) {
        Student s1 = new Student("Mike",18);
        Student s2 = new Student("Michael",18);
        Student s3 = new Student("Marry",20);

        //因为在Object类中，是根据地址值计算出来的哈希值，同一个对象地址相同，所以哈希值相同
        System.out.println(s1.hashCode());
        //哈希值：1324119927
        System.out.println(s1.hashCode());
        //哈希值：1324119927
        System.out.println(s2.hashCode());
        //哈希值：990368553
    }
}
