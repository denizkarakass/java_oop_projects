import java.util.Arrays;

public class dene {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int num;
        int locX = 0, locy = 0, max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                num = (int) (Math.random() * 10);
                matrix[i][j] += num;
                System.out.print(matrix[i][j]);
                max = Math.max(matrix[i][j], max);
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == max) {
                    locy = i + 1;
                    locX = j + 1;
                    System.out.println("Konumu x:" + locX + " Konumu Y:" + locy);
                    break;
                }
            }
        }

    }
}
