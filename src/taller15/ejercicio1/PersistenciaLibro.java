package taller15.ejercicio1;

public class PersistenciaLibro {

    public void guardarEnBaseDeDatos(Libro libro) {
        System.out.println("Guardando el libro '" + libro.getTitulo() + "' en la base de datos.");
    }
}