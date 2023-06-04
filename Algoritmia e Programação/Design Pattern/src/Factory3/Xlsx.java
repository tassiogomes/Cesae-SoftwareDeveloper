package Factory3;

public class Xlsx extends Document {

    public Xlsx(String autor, String nome) {
        super(autor, nome, ".xlsx");
    }

    @Override
    public void open() {
        System.out.println("Abrir o documento xlsx" + getNome() + getExtensao());
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + getAutor() + " salvas");


    }

    @Override
    public void close() {
        System.out.println("Fechar o documento .xlsx");
    }
}
