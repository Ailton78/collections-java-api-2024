package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private Long cod;
    private String nome;
    private Double preco;
    private Integer quatidade;

    public Produto(Long cod, String nome, Double preco, Integer quatidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quatidade = quatidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuatidade(Integer quatidade) {
        this.quatidade = quatidade;
    }

    public Long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuatidade() {
        return quatidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(cod, produto.cod);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    @Override
    public String toString() {
        return "cod: " + cod +
                ", nome: '" + nome + '\'' +
                ", preco: " + preco +
                ", quatidade: " + quatidade ;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
