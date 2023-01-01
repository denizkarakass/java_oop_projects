import java.util.*;

public class recurisve_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an number:");
        int num = in.nextInt();
        boolean res = recP(num, num - 1);
        System.out.println("\n" + res);
    }

    public static boolean recP(int num, int numB) {

        if (numB == 1) {
            return true;
        } else if (num % numB == 0) {
            return false;
        } else if (numB == num) {
            return recP(num, numB);
        }
        numB = numB - 1;
        return recP(num, numB);
    }
}