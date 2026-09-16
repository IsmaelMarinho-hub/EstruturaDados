package Recusividade;
import java.util.Scanner;

public class Fatorial {
    public static int fatorialRec(int n){
        if(n == 0) {
            return 1;
        }
        return n * fatorialRec(n - 1);
    }

    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);

        System.out.println("Digite o valor de n:");
        int n = fa.nextInt();

        System.out.println(n + "!=" + fatorialRec(n));
    }
}
