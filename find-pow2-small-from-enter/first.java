import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        for (int i = 1; Math.pow(2, i) < input; i++) {
            System.out.println(Math.pow(2, i));
        }
    }
}
