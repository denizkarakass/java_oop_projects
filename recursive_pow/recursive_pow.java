import java.util.*;

public class recursive_pow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a NUMBER to give pow of number: ");
        int num = in.nextInt();
        System.out.print("Enter a POW to give pow of number: ");
        int pow = in.nextInt();
        System.out.println(recP(num, pow, 1, num));
    }

    public static int recP(int num, int pow, int sayac, int res) {
        if (sayac != 1) {
            res = res * num;
        }
        if (pow == sayac) {
            return res;
        }
        sayac += 1;
        return recP(num, pow, sayac, res);
    }
}