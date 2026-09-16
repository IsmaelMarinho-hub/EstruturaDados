package Recusividade;
import java.util.Scanner;

public class ImprimirSequeN {
    public static void imprime(int n){
        if(n < 0)
            return;

        System.out.print(n + " ");
        imprime(n - 1);
    }

    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = val.nextInt();

        imprime(n);
    }
}
