public class CokBoyutlu {
    public static void main(String[] args) {
        int[][] matris = new int[3][4];
        int number = 1;

        //1. for = satır döngüsü 2.for = sütun döngüsü
        for( int i= 0; i < matris.length ; i++){

            for( int j = 0; j < matris[i].length ; j++){
                matris[i][j] = number++;
            }

        }


        for( int i= 0; i < matris.length ; i++){

            for( int j = 0; j < matris[i].length ; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();

        }


    }
}
