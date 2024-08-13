package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> listaContatos;

    public AgendaContatos() {
        this.listaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        listaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!listaContatos.isEmpty()) {
            for (Contato c : listaContatos) {
                System.out.println(c);
            }
        } else {
            System.out.println("Lista de contato vazia.");
        }
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : listaContatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, String novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : listaContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
