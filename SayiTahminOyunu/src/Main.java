import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number =(int) (Math.random() * 100);




        Scanner sc = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] worng = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        System.out.println(number);
        while(right < 5) {
            System.out.println("Lütfen Tahmininizi Giriniz :");

            selected = sc.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 Arasında Bir Sayı Giriniz :");

            if (isWrong) {
                right++;
                System.out.println("Çok Fazla Hatalı Giriş Yaptınız Kalan Hak :" + (5 - right));
            }else {
                isWrong =true;
                System.out.println("Bir Daha Hatalı Girişinizde Hakkınızda Düşülecektir");
            }
            continue;
        }

            if (selected == number) {
                System.out.println("Tebrikler Doğru Tahminin ! Tahmin Ettiği Sayı :" +number);
                isWin = true;
                break;
            }else {
                System.out.println("Hatalı Bir Satı Girdiniz ! ");
                if (selected > number){
                    System.out.println(selected + "Sayı Gizli Sayıdan Büyüktür.");
                }else {
                    System.out.println("Sayı Gizli Sayıdan Küçüktür");
                }

                worng[right++]=selected;
                System.out.println("Kalan Hakkı :" + (5 - right));
            }

        }
        if (!isWin){
            System.out.println("Kaybettiniz !");
            if (!isWrong){
                System.out.println("Tahminleriniz :" + Arrays.toString(worng));
            }
        }



    }
}