package Factory3;

public class Pptx extends Document{

    public Pptx(String autor, String nome) {
        super(autor, nome, ".pptx");
    }

    @Override
    public void open() {
        System.out.println("Abrir o documento .pptx" + getNome() + getExtensao());
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + getAutor() + " salvas");
    }

    @Override
    public void close() {
        System.out.println("Fechar o documento .pptx");
    }
}
