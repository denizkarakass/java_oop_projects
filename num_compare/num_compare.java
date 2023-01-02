import java.util.*;

public class num_compare {
    public static void main(String[] args) {
        int[] arr = { 15, 12, 788, 1, -1, -778, 2, 0 };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();

        int[] res = compareNum(arr, num);

        System.out.println("the smalest number is: " + res[0] + "\n The big number is: " + res[1]);
    }

    public static int[] compareNum(int[] arr, int num) {
        int distance = 1000, distance2 = 1000;
        int smallNum = -100;
        int bigNum = -100;
        for (int i = 0; i < arr.length; i++) {
            int newDistance = arr[i] - num;
            if (Math.abs(newDistance) < Math.abs(distance) && newDistance < 0) {
                distance = newDistance;
                smallNum = arr[i];
            }
            if (newDistance < distance2 && newDistance > 0) {
                distance2 = newDistance;
                bigNum = arr[i];
            }
        }
        int[] res = { smallNum, bigNum };
        return res;
    }
}