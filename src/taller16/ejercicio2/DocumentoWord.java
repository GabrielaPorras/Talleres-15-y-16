package taller16.ejercicio2;

public class DocumentoWord extends Documento {

    public DocumentoWord(String nombre) {
        super(nombre);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando el documento '" + nombre + "' a formato Word (.docx).");
    }
}