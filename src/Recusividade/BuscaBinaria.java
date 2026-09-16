package Recusividade;
import java.util.Scanner;

public class BuscaBinaria {
    public static Integer busca(int vetor[], int a, int b, int valor) {

        if (a == b)
            return null;

        int meio = (a + b) / 2;

        if (vetor[meio] == valor)
            return meio;

        if (valor < vetor[meio])
            return busca(vetor, a, meio, valor);
        else
            return busca(vetor, meio + 1, b, valor);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = s.nextInt();
        }

        int valor = s.nextInt();

        System.out.println(busca(vetor, 0, n, valor));

        s.close();
    }
}
