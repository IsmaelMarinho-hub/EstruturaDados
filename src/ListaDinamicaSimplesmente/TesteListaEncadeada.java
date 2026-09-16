package ListaDinamicaSimplesmente;

public class TesteListaEncadeada {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.insereFinal(7);
        lista.insereFinal(3);
        lista.insereFinal(2);

        lista.imprime();

        Integer r = lista.removeInicio();
        System.out.println(r + " foi removido");

        lista.imprime();

        lista.insereInicio(5);
        lista.insereInicio(1);
        lista.insereInicio(4);

        lista.imprime();

        r = lista.removeInicio();
        System.out.println(r + " foi removido");

        lista.imprime();

        lista.inserePosicao(9, 2);

        lista.imprime();

        lista.removePosicao(1);

        lista.imprime();

    }
}
