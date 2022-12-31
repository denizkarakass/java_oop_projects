import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        boolean ok = false;

        boolean result = polindrom(num, ok);
        if (result) {
            System.out.println("This number is Polindrom");
        } else {
            System.out.println("not polindrom");
        }

    }

    public static boolean polindrom(int x, boolean ok) {
        String numS = String.valueOf(x);
        for (int i = 0; i < numS.length() / 2; i++) {
            ok = false;
            String Snum1 = numS.substring(i, i + 1);
            String Snum2 = numS.substring(numS.length() - i - 1, numS.length() - i);

            if (Snum1.equals(Snum2)) {
                ok = true;
            } else {
                ok = false;
                break;
            }
        }
        return ok;
    }
}
