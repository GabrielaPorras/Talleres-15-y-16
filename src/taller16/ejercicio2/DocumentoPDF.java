package taller16.ejercicio2;

public class DocumentoPDF extends Documento {

    public DocumentoPDF(String nombre) {
        super(nombre);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando el documento '" + nombre + "' a formato PDF.");
    }
}
