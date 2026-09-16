package Recusividade;
import java.util.Scanner;

public class ImprimirSequeZ {
    public static void imprime(int n){
        if(n < 0)
            return;
        imprime(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = val.nextInt();

        imprime(n);
    }
}
