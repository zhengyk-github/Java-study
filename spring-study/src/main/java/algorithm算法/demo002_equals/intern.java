package algorithm算法.demo002_equals;

public class intern {

    public static void main(String[] args) {
        String s1 = new String("11");
        s1.intern();
        String s2 = "11";
        System.out.println(s1 == s2);

        String s3 = new String("2") + new String("2");
        s3.intern();
        String s4 = "22";
        System.out.println(s3 == s4);
    }
}
