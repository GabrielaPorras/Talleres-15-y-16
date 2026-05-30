package taller15.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Libro miLibro = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez");

        ReporteLibro reporte = new ReporteLibro();
        PersistenciaLibro persistencia = new PersistenciaLibro();

        reporte.generarReporte(miLibro);
        persistencia.guardarEnBaseDeDatos(miLibro);
    }
}
