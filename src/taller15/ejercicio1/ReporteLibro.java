package taller15.ejercicio1;

public class ReporteLibro {

    public void generarReporte(Libro libro) {
        System.out.println("Generando reporte del libro...");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
    }
}
