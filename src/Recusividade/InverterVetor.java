package Recusividade;

import java.util.Arrays;

public class InverterVetor {
    public static  void inverter(int[] vetor, int inic, int fim){
        if(inic >= fim){
            return;
        }
        int temp = vetor[inic];
        vetor[inic] = vetor[fim];
        vetor[fim] = temp;

        inverter(vetor, inic + 1, fim - 1);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        inverter(vetor, 0, vetor.length - 1);
        System.out.println("Vetor invertido: " + Arrays.toString(vetor));
    }
}
