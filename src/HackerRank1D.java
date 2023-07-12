import java.util.Arrays;
import java.util.Scanner;

public class HackerRank1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];

        for( int i = 0; i < numbers.length; i++){

            numbers[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

    }
}
