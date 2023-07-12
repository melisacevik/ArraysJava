public class Transpose {
    public static void main(String[] args) {
        int[][] matris = { {  1 , 2, 3}, {  4 , 5, 6} };

        int rows = matris.length;
        int cols = matris[0].length;

        int[][] transpose = new int[cols][rows];

        for( int i = 0; i < rows; i++){
            for( int j = 0 ; j < cols ; j++){
                transpose[j][i] = matris[i][j];
            }
        }

        System.out.println("Matrisin Transpozu:");
        for( int i = 0; i < cols ; i++){

            for( int j = 0; j < rows; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
