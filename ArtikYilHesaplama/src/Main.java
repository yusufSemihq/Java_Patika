import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Artık yıl kontrol edilecek yılı giriniz:");

        yil = girdi.nextInt();

        if (yil%400 == 0 ){
            System.out.println(yil + " Artık yıldır");
        } else if (yil%100 != 0 && yil%4 == 0) {
            System.out.println(yil + " Artık yıldır");
        }else {
            System.out.println(yil + " Artık yıl değildir");
        }


    }
}