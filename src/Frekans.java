import java.util.Arrays;
public class Frekans {

    public static void findFrequency( int[] arr){
        int[] frequencies = new int[arr.length];
        boolean[] visited = new boolean[arr.length];

        for( int i = 0; i < arr.length; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            frequencies[i] = count;

        }

        System.out.println("Dizi: " + Arrays.toString(arr));
        System.out.println("Tekrar Sayıları:");

        for( int i = 0; i < arr.length; i++){
            if(frequencies[i] > 0 ){
                System.out.println(arr[i] + " sayısı " + frequencies[i] + " kere tekrar edildi.");
            }
        }

    }


    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        findFrequency(numbers);
    }
}
