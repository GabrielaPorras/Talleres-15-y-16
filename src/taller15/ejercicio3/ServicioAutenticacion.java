package taller15.ejercicio3;

public class ServicioAutenticacion {

    public void iniciarSesion(Usuario usuario, String contrasenaIngresada) {
        if (usuario.getContrasena().equals(contrasenaIngresada)) {
            System.out.println("Inicio de sesion exitoso para el usuario: " + usuario.getNombre());
        } else {
            System.out.println("Error: Contrasena incorrecta.");
        }
    }
}