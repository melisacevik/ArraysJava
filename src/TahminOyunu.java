import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class TahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        boolean isWrong = false;
        boolean isWin = false;
        int[] wrong = new int[5];

        System.out.println(number);

        while( right < 5){

            System.out.println("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();

            if( selected < 0 || selected > 99){
                System.out.println("Lütfen 0-99 arasında bir sayı giriniz. ");
                if( isWrong == true){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + ( 5 - right));
                }else{
                    isWrong = true;
                    System.out.println("Yanlış sayı girdiniz. Bir dahakine canınız azalacak.");
                }
                continue;
            }

            if( selected == number){
                System.out.println("Tebrikss! Doğru tahmin !");
                isWin = true;
                break;
            }else{
                System.out.println("Hatalı sayı!");
                if( selected > number){
                    System.out.println("Girdiğiniz sayı gizli sayıdan büyüktür.");
                }else{
                    System.out.println("Girdiğiniz sayı gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5-right));
            }
        }
        if( !isWin){
            System.out.println("Kaybettiniz");
            if( !isWrong){
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
