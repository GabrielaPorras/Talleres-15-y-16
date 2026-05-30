package taller16.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Mensajero sistemaMensajeria = new Mensajero();

        CanalMensajeria canalEmail = new EmailMensajeria();
        CanalMensajeria canalSms = new SMSMensajeria();

        String aviso = "Su pedido ha sido despachado exitosamente.";

        System.out.println("--- Notificando al cliente ---");
        sistemaMensajeria.procesarEnvio(canalEmail, aviso);
        sistemaMensajeria.procesarEnvio(canalSms, aviso);
    }
}
