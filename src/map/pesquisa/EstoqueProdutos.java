package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        Produto produto = new Produto(nome, quantidade, preco);
        produtosMap.put(cod, produto);
    }

    public void exibirProdutos() {
        if (!produtosMap.isEmpty()) {
            System.out.println(produtosMap);
        } else {
            System.out.println("Lista de Produtos vazia!");
        }
    }

    public Double calcularValorTotalEstoque() {
        Double totalEmEstoque = 0d;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                totalEmEstoque += p.getQuantidade() * p.getPreco();
            }
            return totalEmEstoque;
        } else {
            throw new RuntimeException("Lista de Produtos Vazia!");
        }
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : produtosMap.values()) {
            if (p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : produtosMap.values()) {
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }
    public Produto obterProdutoMaiorQuantidade(){
        Produto produtoMaiorQuatidade = null;
        double maiorQuantidade = Double.MIN_VALUE;
        for (Produto p : produtosMap.values()) {
            double  n = p.getPreco() * p.getQuantidade();
            if (n > maiorQuantidade) {
                produtoMaiorQuatidade = p;
                maiorQuantidade = n;
            }
        }
        return produtoMaiorQuatidade;
    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidade();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
