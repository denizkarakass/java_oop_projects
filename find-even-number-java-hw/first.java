import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (num % 2 == 0) {
                if (num % 4 == 0) {
                    sum += num;
                }
                System.out.print("Enter a number: ");
                num = in.nextInt();
            } else {
                System.out.println("Sum is:" + sum);
                break;
            }
        }
    }
}
