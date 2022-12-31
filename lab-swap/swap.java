package swap;

public class swap {
    public static void main(String[] args) {
        String s1="123",s2="abc";
        System.out.println("s2:" + s2);
        System.out.println("s1: " + s1);
        s1 += s2.substring(0, 3);
        s2 = s1.substring(0,3);
        s1 = s1.substring(3);
       System.out.println("s2:" + s2);
       System.out.println("s1: " + s1);
    }
}
