package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> listaDePedidos;

    public CarrinhoDeCompras() {
        this.listaDePedidos = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDePedidos.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaParaRemolver = new ArrayList<>();
        if (!listaDePedidos.isEmpty()) {
            for (Item i : listaDePedidos) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    listaParaRemolver.add(i);
                }
            }
            listaDePedidos.removeAll(listaParaRemolver);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        if (!listaDePedidos.isEmpty()) {
            for (Item i : listaDePedidos) {
                total += i.getPreco() + i.getQuantidade();
            }
            return total;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirItens() {
        if (!listaDePedidos.isEmpty()) {
            System.out.println(listaDePedidos);
        }else{
            System.out.println("A lista está vazia!");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + listaDePedidos +
                '}';
    }
}
