package Factory3;

public class DocumentFactory {

    public static Document createDocument(String tipo, String nome, String autor){
        switch (tipo){
            case "TEXTO":
                return new Docx(autor,nome);

            case "CALCULO":
                return new Xlsx(autor,nome);

            case "APRESENTACAO":
                return new Pptx(autor,nome);

            default: throw new IllegalArgumentException("Tipo de Documento Inválido: " + tipo);
        }
    }
}