package Factory3;

public class Docx extends Document {

    public Docx(String autor, String nome) {
        super(autor, nome, ".docx");
    }

    @Override
    public void open() {
        System.out.println("Abrir o documento Docx" + getNome() + getExtensao());
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + getAutor() + " salvas");
    }

    @Override
    public void close() {
        System.out.println("Fechar o documento .docx");
    }
}

