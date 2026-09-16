package Recusividade;
import java.util.Scanner;

public class DivisaoInteira {
    public static int divisInt(int a, int b){
        if(a - b < 0){
            return 0;
        }
        return divisInt(a - b, b) + 1;
    }

    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);

        System.out.println("Digite um numero A: ");
        int a = res.nextInt();
        System.out.println("Digite um numero B: ");
        int b = res.nextInt();

        System.out.println(divisInt(a, b));
    }
}
