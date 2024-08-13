package set.operacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private Integer codigoDoConvite;

    public Convidado(String nome, Integer codigoDoConvite) {
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCodigoDoConvite() {
        return codigoDoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return Objects.equals(codigoDoConvite, convidado.codigoDoConvite);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoDoConvite);
    }

    @Override
    public String toString() {
        return "nome: '" + nome + '\'' +
                ", código: '" + codigoDoConvite ;
    }
}
