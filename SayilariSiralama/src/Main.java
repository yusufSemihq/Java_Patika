import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayı :");
        a = input.nextInt();

        System.out.println("2. Sayı :");
        b = input.nextInt();

        System.out.println("3. Sayı :");
        c = input.nextInt();


        if ((a > b) && (a < c)) {
            if (b > c){
                System.out.println("a > b > c");
            }else {
                System.out.println("a > b > c");
            }
        }else if ((b > a) && (b < c)) {
            if (c > a){
                System.out.println("b > a > c");
            }
        }else if ((c > a) && (c < b)) {
            if (c > a){
                System.out.println("c > b > a");
            }
        }

    }
}