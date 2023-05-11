public class PL10_05 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Pessoa pessoa1 = new Pessoa("João", "joao@gmail.com", "123456789", 25);
        Pessoa pessoa2 = new Pessoa("Maria", "maria@gmail.com", "987654321", 30);
        Pessoa pessoa3 = new Pessoa("Pedro", "pedro@gmail.com", "55555555", 20);

        agenda.adicionarPessoa(pessoa1);
        agenda.adicionarPessoa(pessoa2);
        agenda.adicionarPessoa(pessoa3);

        agenda.listarPessoas();
    }
}
