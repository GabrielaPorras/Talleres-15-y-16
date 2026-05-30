package taller16.ejercicio2;

public class DocumentoExcel extends Documento {

    public DocumentoExcel(String nombre) {
        super(nombre);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando el documento '" + nombre + "' a formato Excel (.xlsx).");
    }
}
