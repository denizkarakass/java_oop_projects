/*
 * Name: Deniz 
 * Surname: Karakaş
 * ID: 210316025
 * Question: 28
 */
public class q3_210316025 {

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];
        matrix = fillRandom(matrix);
        yazdir(matrix);
        int large = getLargestNumber(matrix);
        int count = countOccurrences(large, matrix);
        System.out.println("Largest number: " + large);
        System.out.println("Number of occurrences: " + count);

    }

    public static int[][] fillRandom(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int sayi = (int) (Math.random() * 9 + 1);
                matrix[i][j] += sayi;
            }
        }
        return matrix;
    }

    public static void yazdir(int[][] matrix) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getLargestNumber(int[][] matrix) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static int countOccurrences(int number, int[][] matrix) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == number) {
                    count++;
                }
            }
        }
        return count;
    }

}
