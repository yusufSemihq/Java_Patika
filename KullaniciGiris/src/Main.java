import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

       String usurName , password;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız :");
        usurName = sc.nextLine();

        System.out.print("Şifrenizi Giriniz :");
        password = sc.nextLine();

        if (usurName.equals("Yusuf") && password.equals("1234")) {
            System.out.println("Girişiniz Başarılıdır");
        }else {
            System.out.println("Giriş Başarısızdır Tekrardan Deneyiniz");
        }
    }
}