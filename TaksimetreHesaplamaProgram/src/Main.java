import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Değişkenimizi Tanımlıyoruz

        int km;
        double perkm = 2.20 , total , starPrice = 10;



        Scanner sc = new Scanner(System.in);
        System.out.println("Mesafeyi Km Cinsinden Giriniz : ");
        km = sc.nextInt();


        total = (km * perkm);
        total += starPrice;


        total = (total > 20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);







    }
}