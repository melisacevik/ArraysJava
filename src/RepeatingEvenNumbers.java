public class RepeatingEvenNumbers {

    public static void duplicate(int[] arr){

        int count = 1;
        for( int i = 0; i < arr.length; i ++){

            for( int j = i + 1 ; j < arr.length ; j++){

                if( arr[i] == arr[j]){
                    if(arr[j] % 2 == 0 ){
                        System.out.println("Repeated " + count++ +"th number = " + arr[j]);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] list = { 3,44,5,66,7,8,9,2,3,4,8,78};
        duplicate(list);
    }
}
