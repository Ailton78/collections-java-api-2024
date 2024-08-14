package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listaProdutos;

    public CadastroProdutos() {
        this.listaProdutos = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        listaProdutos.add(new Produto(cod, nome, preco, quantidade));
    }
   /*
   public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
        if(!produtosPorNome.isEmpty()){
            return produtosPorNome;
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }

    }
    */
   public void exibirProdutosPorNome(){
       Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
       if(!produtosPorNome.isEmpty()){
           for(Produto p : produtosPorNome){
               System.out.println(p);
           }
       }else{
           throw new RuntimeException("O conjunto está vazio!");
       }

   }

   /*
   public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!listaProdutos.isEmpty()) {
            produtosPorPreco.addAll(listaProdutos);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
    */
    public void exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!listaProdutos.isEmpty()) {
            produtosPorPreco.addAll(listaProdutos);
            for(Produto p : listaProdutos){
                System.out.println(p);
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }


}
