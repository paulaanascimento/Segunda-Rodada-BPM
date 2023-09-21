public class Main {
    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();

        int quantidade = ordenacao.lerQuantidade();
        ordenacao.lerNumeros(quantidade);
        ordenacao.ordenarListas();
        ordenacao.mostrarNumeros();
    }
}
