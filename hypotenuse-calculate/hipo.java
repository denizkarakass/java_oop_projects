import java.util.Scanner;

public class hipo {
    public static void main(String[] args) {
        double a,b,c;
        Scanner in = new Scanner(System.in);

        System.out.print("Value of A: ");
        a = in.nextDouble();
        
        System.out.print("Value of B: ");
        b = in.nextDouble();

        c =  Math.pow(Math.pow(a, 2) + Math.pow(b, 2) , 0.5);

         System.out.println("Hipo is equal: " + c);
    }
}
