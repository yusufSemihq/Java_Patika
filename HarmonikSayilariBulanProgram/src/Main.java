import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("N Sayısını Giriniz :");
        int n = sc.nextInt();
        double resault = 0.0;
        for (double i = 1; i <= n; i++) {
            resault += (1/i);
        }
        System.out.println(resault);
    }
}