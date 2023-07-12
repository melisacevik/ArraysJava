import java.util.Arrays;
import java.util.Scanner;

public class SortingElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int n = input.nextInt();
        System.out.println("Dizinin elemanlarını giriniz: ");

        int[] numbers = new int[n];

        for( int i = 0 ; i < numbers.length ; i++){

            System.out.print(i+1 + " ." + " Elemanı :");
            numbers[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        System.out.println("Sıralı hali: " + Arrays.toString(numbers));
    }
}
