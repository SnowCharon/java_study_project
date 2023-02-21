package experiment;

import java.util.Arrays;
public class CopyArray {
    public static void main (String[] args) {
        int [] a = {1,2,3,4,500,600,700,800};
        int [] b,c,d;
        System.out.println(Arrays.toString(a));
        b = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(b));
        c = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(c));
        d = Arrays.copyOfRange(a,a.length - 4,a.length);
        System.out.println(Arrays.toString(d));
        d[d.length-1] = -200;
        System.out.println(Arrays.toString(a));
    }
}