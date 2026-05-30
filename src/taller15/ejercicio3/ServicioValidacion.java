package taller15.ejercicio3;

public class ServicioValidacion {

    public boolean validarDatos(Usuario usuario) {
        if (usuario.getNombre() != null && usuario.getContrasena() != null) {
            System.out.println("Los datos del usuario son validos.");
            return true;
        } else {
            System.out.println("Los datos del usuario son invalidos.");
            return false;
        }
    }
}
