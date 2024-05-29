import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double tutar, kdvOran = 0.18, kdvliTutar, kdvTutar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz :");
        tutar = sc.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = kdvTutar + tutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutar :" + kdvTutar);
        System.out.println("KDV'Li Tutar : " + kdvliTutar);
    }
}