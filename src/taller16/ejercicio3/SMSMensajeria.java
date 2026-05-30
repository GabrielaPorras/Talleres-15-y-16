package taller16.ejercicio3;

public class SMSMensajeria implements CanalMensajeria {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS al numero registrado: " + mensaje);
    }
}
