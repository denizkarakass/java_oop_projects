import java.util.*;

public class recursive_method_following {
    public static void main(String[] args) {
        int plus = 0, num = 1;
        System.out.println(recrusive(plus, num));
    }

    public static int recrusive(int plus, int num) {
        plus += 1;
        System.out.print(num + " ");
        num += plus;
        if (plus == 9) {
            return num;
        }
        return recrusive(plus, num);
    }
}