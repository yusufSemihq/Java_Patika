
import java.util.Scanner;

public class Main {
    static void number(int n) {
        number(n, 0);
    }
    static int number(int n, int total) {
        if(n <= 0)
            return result(n, total);
        System.out.print(n + " ");
        return number(n - 5, ++total);
    }
    static int result(int n, int total) {
        System.out.print(n + " ");
        if(total == 0)
            System.exit(0);
        return result(n + 5, --total);
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("\n" + "Numarayı Girin: ");
        n = input.nextInt();
        number(n);

    }
}