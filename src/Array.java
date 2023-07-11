public class Array {

    static void printArray(int[] arr){
        for(int i=0; i < arr.length ; i++){
            arr[i] = (i *10) + 10;
            System.out.println(arr[i]);
        }
    }

    static void printArray(double[] arr){
        for(int i=0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] list = {10,20,30,40,50,60,70,80,90,100};
        double[] list2 = {1.1 , 2.2, 3.3};
        printArray(list2);
    }
}
