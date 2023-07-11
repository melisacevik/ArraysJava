public class ForEach {
    public static void main(String[] args) {

        //integer değerlerde
        int[] list = { 0,1,2,3,4};

        int sum = 0;
        for(int i: list){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("=========");

        //string değerlerde
        String[] cars = { "BMW" , "Mercedes" , "Audi" };

        for(String i: cars){
            System.out.println(i);
        }

        System.out.println("==========");
        //çok boyutlu dizilerde

        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        //uzun yöntem ile
        /*
        for(int i=0; i < matris.length ; i++){
            for( int k=0; k < matris[i].length ; k++){
                System.out.print(matris[i][k] + " ");
            }
            System.out.println();
        }

         */
        for(int[] row: matris){
            //row'un colunu gezmek icin;
            for(int col: row){
                System.out.print (col + " ");
            }
            System.out.println();
        }
    }
}
