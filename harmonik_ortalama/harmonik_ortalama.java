import java.util.*;

public class harmonik_ortalama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        harmoni(x);
    }

    public static void harmoni(int n) {
        double result = 0;
        for (int i = 1; i < n + 1; i++) {
            result = result + (Math.pow(i, -1));
            System.out.println(result);
        }
        System.out.println("Harmonik avarage is " + result / n);
    }
}