package Recusividade;

import java.util.Scanner;

public class MDC {
    public static int calcularMDC(int a, int b){
        if(b == 0){
            return a;
        }
        return calcularMDC(b, a % b);
    }

    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        int a = res.nextInt();
        System.out.println("Digite o valor B: ");
        int b = res.nextInt();

        int mdc = calcularMDC(a, b);
        System.out.println("MDC de " + a + " e " + b + ": " + mdc);
    }
}
