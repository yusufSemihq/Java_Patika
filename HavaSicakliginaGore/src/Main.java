import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner sc = new Scanner(System.in);
        System.out.print("Sıcaklığı Girniz :");
        heat = sc.nextInt();


        if (heat <= 5){
            System.out.println("Kayak Yapabilirsiniz ");
        } else if (heat <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz ");
        }else if (heat <= 25) {
            System.out.println("Pikniye Gidebilirsiniz ");
        } else if (heat >= 25) {
            System.out.println("Yüzmeye Gidebilirsiniz ");
        }


    }
}