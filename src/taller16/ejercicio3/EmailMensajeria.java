package taller16.ejercicio3;

public class EmailMensajeria implements CanalMensajeria {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL con el texto: " + mensaje);
    }
}
