package Recusividade;
import java.util.Scanner;

public class Somatorio {
    public static int somar(int n){
        if(n == 0){
            return 0;
        }
        return n + somar(n - 1);
    }
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = re.nextInt();
        System.out.println(somar(n));
    }
}
