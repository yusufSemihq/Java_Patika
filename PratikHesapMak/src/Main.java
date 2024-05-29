import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1, n2, seleckt;

        Scanner sc = new Scanner(System.in);
        System.out.print("İlk Sayınızı Giriniz : ");
        n1 = sc.nextInt();
        System.out.print("İkinci Sayınızı Giriniz : ");
        n2 = sc.nextInt();


        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz :");
        seleckt = sc.nextInt();

        switch (seleckt = 1) {


            case 1:
                System.out.println("Toplam : " + (n1 + n2));


            case 2:
                System.out.println("Çıkarma :" + (n1 - n2));


            case 3:
                System.out.println("Çarpma :" + (n1 * n2));


            case 4:
                System.out.println("Bölme :" + (n1 / n2));


            default:
                System.out.println("Yanlış Seçim Yaptınız");


        }


    }
}