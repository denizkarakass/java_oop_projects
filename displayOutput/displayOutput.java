import java.lang.reflect.Array;
import java.util.*;

public class displayOutput {
    public static void main(String[] args) {
        output();
    }

    public static void output() {
        int num = 1;
        int[] nums = new int[6];
        for (int i = 0; i < 6; i++) {
            num *= 2;
            nums[i] = num;
            for (int k = 0; k < i + 1; k++) {
                System.out.print(nums[k] + " ");
            }
            System.out.println();
        }
    }
}