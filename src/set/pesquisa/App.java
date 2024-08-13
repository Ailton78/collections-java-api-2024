package set.pesquisa;

public class App {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", "123456");
        agendaContatos.adicionarContato("Camila", "5665");
        agendaContatos.adicionarContato("Camila Cavalcante", "111111");
        agendaContatos.adicionarContato("Camila DIO", "655487");
        agendaContatos.adicionarContato("Maria Silva", "111111");

        agendaContatos.exibirContatos();
        System.out.println();
        System.out.println(agendaContatos.pesquisaPorNome("Camila"));
        agendaContatos.atualizarNumeroContato("Maria Silva", "555555");
        agendaContatos.exibirContatos();
    }
}
