public class MHarfi {
    public static void main(String[] args) {

        String[][] letter = new String[6][6];

        for (int i = 0; i < letter.length; i++) {

            for (int j = 0; j < letter[i].length; j++) {

                if (j == 0 || j == 5) {
                    letter[i][j] = " * ";
                } else if (i == 1 && (j == 1 || j == 4)) {
                    letter[i][j] = " * ";
                } else if (i == 2 && (j == 2 || j == 3)) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
