public class Main {
    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();

        lista.adicionar("Arroz");
        lista.adicionar("Feijão");
        lista.adicionar("Leite");

        lista.marcar_comprado(("Arroz"));
        lista.remover("Leite");

        lista.listar();
        System.out.println("toral de produtos:" + lista.total());
    }
}