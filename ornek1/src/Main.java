import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double domates = 2.2;
        double patates = 3.5;
        double salatalık = 3.7;
        double sogan = 9.9;

        Scanner sc = new Scanner(System.in);


        System.out.println("Kaç Kilo Domates Giriniz :");
        int domates_kg = sc.nextInt();

        System.out.println("Kaç Kilo Patates Giriniz :");
        int patates_kg = sc.nextInt();

        System.out.println("Kaç Kilo Salatalık Giriniz :");
        int salatalık_kg = sc.nextInt();

        System.out.println("Kaç Kilo Soğan Giriniz :");
        int sogan_kg = sc.nextInt();


        double toplam_tutar = (domates_kg * domates) + (patates_kg * patates) + (salatalık_kg * salatalık) + (sogan_kg * sogan);
        System.out.println("Kaç TL" + toplam_tutar);

    }
}