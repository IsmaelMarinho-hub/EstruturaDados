package Recusividade;

public class SomaVetor {
    public static int somar(int[] vetor, int n){
        if(n <= 0){
            return 0;
        }
        return vetor[n -1] + somar(vetor, n - 1);
    }

    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40};
        int resu = somar(vetor, vetor.length);
        System.out.println("Soma: " + resu);
    }
}
