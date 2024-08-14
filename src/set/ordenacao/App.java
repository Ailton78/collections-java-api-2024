package set.ordenacao;

public class App {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);


        // Exibindo produtos ordenados por nome
        //System.out.println(cadastroProdutos.exibirProdutosPorNome());
        cadastroProdutos.exibirProdutosPorNome();
        System.out.println();

        // Exibindo produtos ordenados por preço
        //System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        cadastroProdutos.exibirProdutosPorPreco();
    }
}
