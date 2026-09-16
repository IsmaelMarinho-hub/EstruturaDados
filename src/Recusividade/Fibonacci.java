package Recusividade;
import java.util.Scanner;

public class Fibonacci {
    public static int fiboRec(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else{
            return fiboRec(n-1) + fiboRec(n-2);
        }
    }

    public static void main(String[] args) {

        Scanner va = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = va.nextInt();

        for(int i = 0; i <= n; i++){
            System.out.println("Fibo(" + i + ") = " + fiboRec(i));
        }
    }
}
