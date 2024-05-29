import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    static int toplam (int a, int b) {
        return a + b;
    }
    static int cikarma (int a, int b) {
        return a - b;
    }
    static int carpma (int a, int b){
        return a*b;
    }
    static int bolme (int a, int b ){
        return a/b;
    }
    static int usAlma(int a, int b){
        int resault = 1;
        for(int i = 0; i < b; i++){
            resault *= a;
        }
        return resault;
    }
    static int fak(int a){
        int resault = 1;
        if(a == 0 || a == 1){
            resault = 1;
        }
        return resault = a * fak(a-1);
    }
    static int mod (int a, int b){
        return a%b;
    }
    static int alan (int a , int b){
        return a*b;
    }
    static int cevre(int a, int b){
        return 2*(a+b);
    }



    public static void main(String[] args) {

        int selecekt ;
        Scanner input = new Scanner (System.in);

        String menu =" 1-Toplma İşlemi :\n 2-Çıkarma İşlemi :\n 3-Çaprma İşlemi :\n 4-Bölme İşlemi :\n 5-Üslü Sayı Hesaplama :\n 6-Faktöriyel Hesaplama :\n 7-Mod Alma :\n 8-Dikdörtgen Alan ve Çevre Hesabı :\n ";


        System.out.println("Bir İşlem Seçiniz\n");
        System.out.println(menu);
        selecekt = input.nextInt();
        int a,b;


        switch (selecekt){
            case 1:
                System.out.println("Enter Num A: ");
                a = input.nextInt();
                System.out.println("Enter Num B: ");
                b = input.nextInt();
                System.out.println("Toplam :" + toplam(a,b));
                break;


            case 2:
                System.out.println("Enter Num A: ");
                a = input.nextInt();
                System.out.println("Enter Num B: ");
                b = input.nextInt();
                System.out.println("Fark :" +cikarma(a,b));
                break;


            case 3:
                System.out.println("Enter Num A: ");
                a = input.nextInt();
                System.out.println("Enter Num B: ");
                b = input.nextInt();
                System.out.println("Çarpma :" + carpma(a,b));
                break;


            case 4:
                System.out.println("Enter Num A: ");
                a = input.nextInt();
                System.out.println("Enter Num B: ");
                b = input.nextInt();
                System.out.println("Bölme :" + bolme(a,b));
                break;


            case 5:
                System.out.println("Enter Num A: ");
                a = input.nextInt();
                System.out.println("Enter Num B: ");
                b = input.nextInt();
                System.out.println("Üs Hesabı :" + usAlma(a,b));
                break;



            case 6:
                System.out.println("Enter Num A: ");
                a = input.nextInt();
                System.out.println("Faktöriyel :" +fak(a));
                break;


            case 7:
                System.out.println("Enter Num A: ");
                a = input.nextInt();
                System.out.println("Enter Num B: ");
                b = input.nextInt();
                System.out.println("Mod Alma :" +mod(a,b));
                break;

            case 8:
                System.out.println("enter a num:");
                a=input.nextInt();
                System.out.println("enter b num:");
                b=input.nextInt();
                System.out.println("Alan:"+alan(a,b));
                System.out.println("Cevre:"+cevre(a,b));
                break;




        }










    }
}