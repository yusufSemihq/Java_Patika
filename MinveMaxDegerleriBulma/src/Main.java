
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int minValue = 1, maxValue = 1;


        System.out.print("Kaç Tane Sayı Giriceksiniz :");
        int n1 = input.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.print(i+". Sayıyı Giriniz :");
            int sayi = input.nextInt();

        if (sayi >maxValue){
            maxValue = sayi;
        }
        if (sayi <minValue){
            minValue = sayi;
        }

        }
        System.out.println("En Büyük Sayınızı Giriniz :"+maxValue);
        System.out.println("En Küçük Sayınızı Giriniz :"+minValue);
    }
}