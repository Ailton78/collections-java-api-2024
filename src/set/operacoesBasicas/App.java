package set.operacoesBasicas;


import java.util.Set;

public class App {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Ailton", 1011);
        convidados.adicionarConvidado("Carlos", 1012);
        convidados.adicionarConvidado("Emilly", 1013);
        convidados.adicionarConvidado("Luana", 1014);
        convidados.adicionarConvidado("Ryan", 1015);

       convidados.exibirConvidados();
        System.out.println();
       convidados.contarConvidados();
        System.out.println();
        convidados.removerConvidadoPorCodigoConvite(1014);
        System.out.println();
       convidados.exibirConvidados();
        convidados.removerConvidadoPorCodigoConvite(1014);

    }
}
