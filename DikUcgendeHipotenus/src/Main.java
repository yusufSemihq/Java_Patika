import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //   Değişkenlerimizi Oluşturalım
       int a,b;
       int c;



    //Kullanıcıdan verilerimizi alalım
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz");
        a = girdi.nextInt();
        System.out.println("2. Kenarı Giriniz");
        b = girdi.nextInt();


        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs :" + c);

    }

}