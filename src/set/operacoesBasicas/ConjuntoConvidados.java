package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> listaDeConvidados;

    public ConjuntoConvidados() {
        this.listaDeConvidados = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        listaDeConvidados.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        if(!listaDeConvidados.isEmpty()){
            for(Convidado c: listaDeConvidados){
                if (c.getCodigoDoConvite() == codigoConvite){
                    listaDeConvidados.remove(c);
                    System.out.println("Convidado "+ c.getNome().toUpperCase() + " Remolvido com sucesso!");
                    break;
                }

            }
                    System.out.println("Código não consta na lista");
        }else {
            System.out.println("Lista vazia.");
        }
    }
    public void contarConvidados(){
        if(!listaDeConvidados.isEmpty()){
        System.out.println("Total de Convidados: "+listaDeConvidados.size());
        }else{
            System.out.println("Lista esta vazai!");
        }
    }
    public  void  exibirConvidados(){
        for(Convidado c : listaDeConvidados){
            System.out.println(c);
        }
    }

}
