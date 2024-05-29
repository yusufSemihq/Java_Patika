import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, turkce, tarih, muzik;

        Scanner sc = new Scanner(System.in);

        System.out.println("Matematik Notunuz :");
        mat = sc.nextInt();

        System.out.println("Fizik Notunuz Giriniz");
        fiz = sc.nextInt();

        System.out.println("Kimya Notunuz Giriniz");
        kim = sc.nextInt();

        System.out.println("Türkçe Notunuz Giriniz ");
        turkce = sc.nextInt();

        System.out.println("Tarih Notunuz Giriniz");
        tarih = sc.nextInt();

        System.out.println("Muzik Notunuz Giriniz");
        muzik = sc.nextInt();

        int toplam = mat + fiz + kim + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        // 50'nin altında olanlar sınıfta kalır
        if (sonuc < 50) {
            System.out.println("Maalesef, sınıfta kaldınız.");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
    }
}
