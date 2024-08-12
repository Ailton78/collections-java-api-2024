import list.OperacoesBasicas.CarrinhoDeCompras;
import list.OperacoesBasicas.ListaTarefa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefa tarefas = new ListaTarefa();
        tarefas.adicionarTarefa("Tarefa 1");

        System.out.println("Número total de tarefa: " + tarefas.obterNumeroTotalTarefas());
        tarefas.removerTarefa("Tarefa 1");
        System.out.println("Número total de tarefa: " + tarefas.obterNumeroTotalTarefas());
        tarefas.obterDescricoesTarefas();

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }
}