import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayıyı Giriniz :");
        int a = input.nextInt();
        System.out.println("2. Sayıyı Girnizi :");
        int b = input.nextInt();

        for (int i =a; i <= b; i++)
        {
            boolean asal=true;
            for(int j=2;j<=(i/2)+1;j++)

                if(i%j==0)
                {
                    asal=false;
                    break;
                }
            if(asal)
                System.out.println(i+"\t");

        }

    }
}