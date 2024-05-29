package com.company;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArkadasSayi{
public class Main {
    public static int main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci Sayınızı Giriniz :");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci Sayıyı Giriniz :");
        int sayi2 = scanner.nextInt();

        if (Arkadasmi(sayi1 , sayi2)){
            System.out.println("Bu İki Sayı Arkadaştır");
        }else{
            System.out.println("Bu İki Sayı Arkadaş Değildir");
        }
        
        boolean Arkadasmi;(int sayi1, int sayi2){
            if(sayi1 == BolenToplama (sayi2) && sayi2 == BolenToplama(sayi1)){
                return true;
            }else {
                return false; 
            }
        }


        public static int BolenToplami(int sayi){
            int bolentoplami = 0 ;
            for (int i = 1; i <= sayi; i++){
                if (sayi%i == 0){
                    bolentoplami = bolentoplami+i;
                }
            }
            return bolentoplami;
        }




    }

    private static int BolenToplama(int sayi2) {
    }


}
}