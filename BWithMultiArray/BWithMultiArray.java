public class BWithMultiArray {
    public static void main(String[] args) {
        createB();
    }

    public static void createB() {
        String[][] B = {
                { "* ", "* ", "* ", "* " },
                { "* ", "  ", "  ", "* " },
                { "* ", "  ", "  ", "* " },
                { "* ", "* ", "* ", "* " },
                { "* ", "  ", "  ", "* " },
                { "* ", "  ", "  ", "* " },
                { "* ", "* ", "* ", "* " } };

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
    }
}