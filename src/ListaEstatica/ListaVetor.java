package ListaEstatica;

public class ListaVetor {

    private int vetor[];
    private int nElementos;

    public ListaVetor(int tamanho) {
        this.vetor = new int[tamanho];
        this.nElementos = 0;
    }

    public int tamanho() {
        return this.nElementos;
    }

    public void imprime() {

        System.out.print("[ ");
        for (int i = 0; i < this.nElementos; i++) {
            System.out.print(this.vetor[i] + " ");
        }
        System.out.println("]");
    }

    public boolean estaVazia() {
        return this.nElementos == 0;
    }

    public boolean estaCheia() {
        return this.nElementos == this.vetor.length;
    }

    public void insereFinal(int elemento) {

        if (this.estaCheia()) {
            System.out.println("Lista cheia! Não é possível inserir.");
            return;
        }

        this.vetor[this.nElementos] = elemento;

        this.nElementos++;
    }

    public Integer removeFinal() {

        if (this.estaVazia()) {
            System.out.println("Lista vazia! Não é possível remover.");
            return null;
        }

        int removido = this.vetor[this.nElementos - 1];

        this.nElementos--;

        return removido;
    }

    public void insereInicio(int elemento) {

        if (this.estaCheia()) {
            System.out.println("Lista cheia! Não é possível inserir.");
            return;
        }

        for (int i = this.nElementos; i >= 1; i--) {
            this.vetor[i] = this.vetor[i - 1];
        }

        this.vetor[0] = elemento;
        this.nElementos++;
    }

    public Integer removeInicio() {

        if (this.estaVazia()) {
            System.out.println("Lista vazia! Não é possível remover.");
            return null;
        }

        int removido = this.vetor[0];

        for (int i = 1; i < this.nElementos; i++) {
            this.vetor[i - 1] = this.vetor[i];
        }

        this.nElementos--;

        return removido;

    }

    public void inserePosicao(int elemento, int pos) {

        if (this.estaCheia()) {
            System.out.println("Lista cheia! Não é possível inserir.");
            return;
        } else if (pos < 0) {
            System.out.println("Posição negativa. Não é possível inserir.");
            return;
        } else if (pos > this.nElementos) {
            System.out.println("Posição inválida. Não é possível inserir");
            return;
        }

        for (int i = this.nElementos; i > pos; i--) {
            this.vetor[i] = this.vetor[i - 1];
        }

        this.vetor[pos] = elemento;

        this.nElementos++;
    }

    public Integer removePosicao(int pos) {
        if (this.estaVazia()) {
            System.out.println("Lista vazia! Não é possível remover.");
            return null;
        }

        if (pos < 0 || pos >= this.nElementos) {
            System.out.println("Posição inválida. Não é possível remover.");
            return null;
        }

        int removido = this.vetor[pos];

        for (int i = pos; i < this.nElementos - 1; i++) {
            this.vetor[i] = this.vetor[i + 1];
        }

        this.nElementos--;

        return removido;

    }

    /*
     * Caso a lista seja ordenada, os métodos insereInicio, insereFinal e
     * inserePosicao devem ser privados para que seja garantido a ordenação dentro
     * da lista.
     *
     */
    public void insereOrdenado(int elemento) {

        if (this.estaCheia()) {
            System.out.println("Lista cheia! Não é possível inserir.");
            return;
        }

        for (int i = 0; i < this.nElementos; i++) {
            if (this.vetor[i] > elemento) {
                this.inserePosicao(elemento, i);
                return;
            }
        }

        this.insereFinal(elemento);
    }

    public Integer acesse(int pos) {

        if (pos < 0 || pos >= this.nElementos) {
            System.out.println("Posição não acessível");
            return null;
        }

        return this.vetor[pos];
    }

    public boolean contem(int elemento) {
        for (int i = 0; i < this.nElementos; i++) {
            if (this.vetor[i] == elemento) {
                return true;
            }
        }

        return false;
    }
}
