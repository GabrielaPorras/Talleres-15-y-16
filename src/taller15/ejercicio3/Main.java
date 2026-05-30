package taller15.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Usuario miUsuario = new Usuario("carlos_dev", "claveSegura123");

        ServicioValidacion validador = new ServicioValidacion();
        ServicioAutenticacion autenticador = new ServicioAutenticacion();

        boolean esValido = validador.validarDatos(miUsuario);

        if (esValido) {
            System.out.println("--- Intento con contrasena correcta ---");
            autenticador.iniciarSesion(miUsuario, "claveSegura123");

            System.out.println("--- Intento con contrasena incorrecta ---");
            autenticador.iniciarSesion(miUsuario, "12345");
        }
    }
}