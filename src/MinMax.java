import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int[] list = {51, 56, 1, 8, -23, -22, 11};
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        for (int i : list) {
            if (i < n && i > closestSmaller) {
                closestSmaller = i;
            }

            if (i > n && i < closestLarger) {
                closestLarger = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }
}
