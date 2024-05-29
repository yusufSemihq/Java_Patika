import java.util.Scanner;

public class tribonaccidizisi {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner klavye=new Scanner(System.in);
        System.out.print("Kaç Adet Fibonnacci Sayısı Görmek İstiyorsunuz? :");
        int sayi=klavye.nextInt();
        int birinci=0;
        int ikinci=1;
        int ucuncu=birinci+ikinci;

        System.out.println("Fibonacci Sayıları ");
        System.out.print(birinci+ " "+ikinci+ " ");

        while(sayi>0){
            System.out.print(ucuncu+ " ");
            sayi--;
            birinci=ikinci;
            ikinci=ucuncu;
            ucuncu=birinci+ikinci;


        }

    }

}