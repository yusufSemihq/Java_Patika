import java.sql.SQLOutput;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double boy,kg,vki;
        Scanner sc = new Scanner(System.in);

        System.out.println("Boyunuzu Giriniz :");
        boy = sc.nextDouble();

        System.out.println("Kilonuzu Giriniz :");
        kg = sc.nextDouble();

        System.out.println("Vücut Endeksinizi Giriniz :");
        vki = sc.nextDouble();

        vki = boy * vki;
        System.out.println("Vücut Endeksinizi Giriniz :" +vki);

        if (vki > 18.5){
            System.out.println("Zayıfsınız Sağlıklı Bir Şekilde Kilo Almalısınız");
        } else if (vki > 18.5 & vki < 24.5) {
            System.out.println("Kilonuz Normal Düzenli Egzersi Ve Spor Yapablirsiniz");
        } else if (vki>25 & vki<29.9) {
            System.out.println("Fazla Kilolusunuz Kilo Vermelisiniz ");
        } else if (vki > 30) {
            System.out.println("Kilonuz Obezite Seviyesinde Diyetisyenize Başvurmalısınız");
        }


    }
}