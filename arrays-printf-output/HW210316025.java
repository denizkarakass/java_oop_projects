/*
 * Name - Surname: Deniz - Karakaş
 * Student ID: 210316025
 */

package output;

public class HW210316025 {
    public static void main(String[] args) {
        // Creating an array for each column.
        String[] out1 = { "Output-1", "1", "23", "345", "4567", "56789", "   ", "   ", "   ", "   " };
        String[] out2 = { "Output-2", "12345", "2345", "345", "45", "5", "   ", "   ", "   ", "   " };
        String[] out3 = { "Output-3", "1", "19", "1925", "192549", "19254981", "192549", "1925", "19", "1" };
        // Format printing.
        System.out.printf("%s        ", out1[0]);
        System.out.printf("%s        ", out2[0]);
        System.out.printf("%s", out3[0]);
        System.out.println();

        // I printed the indexes in the array sequentially with a loop.
        for (int i = 1; i < 10; i++) {
            System.out.printf("%s                 ", out1[i]);
            System.out.printf("%s         ", out2[i]);
            System.out.printf("%s", out3[i]);
            System.out.println();
        }
    }
}

// COMPLETED TEST PROCESS