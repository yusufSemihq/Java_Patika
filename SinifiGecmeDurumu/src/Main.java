import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int mat,fiz,kim,muzik ;

            Scanner input = new Scanner(System.in);

            System.out.println("Matematik Notunuzu Girniz :");
            mat = input.nextInt();

            System.out.println("Fizik Notunuzu Girniz :");
            fiz = input.nextInt();

            System.out.println("Kimya Notunuzu Girniz :");
            kim = input.nextInt();

            System.out.println("Müzik Notunuzu Girniz :");
            muzik = input.nextInt();

            double avarage = (mat + fiz + kim + muzik ) / 4;

            if (avarage <= 55){
                System.out.print("Sınıfta Kaldınız Senye Tekrar Görüşmek üzere");
            }else if (avarage > 55 && avarage <= 100){
                System.out.println("Geçtiniz");
            } else if (avarage > 60 && avarage <= 100) {
                System.out.println("Geçtiniz");
            }else if (avarage > 70 && avarage <= 100) {
                System.out.println("Geçtiniz");
            } else if (avarage > 80 && avarage <= 100) {
                System.out.println("İyi Geçtiniz ");
            }else if (avarage > 90 && avarage <= 100) {
                System.out.println("Mükemmel Geçtiniz");
            } else if (avarage > 100 && avarage <= 100) {
                System.out.println("Mükemmel Geçtiniz");
            }else {
            System.out.println("0'Dan ve 100'Den Büyük , Küçük Olduğu İçin Ortalamaya Katılamadınız ");
        }


    }
}