package Recusividade;
import java.util.Scanner;

public class PontenciaBinario {
    public static int potBin(int n){
        if(n == 0){
            return 1;
        }
        return 2 * potBin(n - 1);
    }

    public static void main(String[] args) {

        for(int n = 0; n <= 10; n++){
            System.out.println("2^(" + n + ") = " + potBin(n));
        }
    }
}
