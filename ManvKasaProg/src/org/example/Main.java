package org.example;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);



       double elma = 2.15;
       double armut = 9.00;
        double portakal = 1.11;
       double patates = 3.12;
       double kavun = 8.87;
      double karpuz = 7.77;


       System.out.println("Kaç Kilo Elma : ");
       int elma_kg = sc.nextInt();
       System.out.println("Kaç Kilo Armut :");
       int armut_kg = sc.nextInt();

       System.out.println("Kaç Kilo Portakal :");
       int portakal_kg = sc.nextInt();

      System.out.println("Kaç Kilo Patates :");
       int patates_kg = sc.nextInt();

        System.out.println("Kaç Kilo Kavun  :");
        int kavun_kg = sc.nextInt();

       System.out.println("Kaç Kilo Karpuz :");
        int karpuz_kg = sc.nextInt();



        double toplam_tutar = (elma_kg * elma) + (armut_kg * armut) +  (portakal_kg * portakal) + (patates_kg * patates) + (kavun_kg * kavun) + (karpuz_kg * karpuz);
       System.out.println("Kaç TL" +toplam_tutar);



    }
}




