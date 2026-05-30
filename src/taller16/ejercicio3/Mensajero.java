package taller16.ejercicio3;

public class Mensajero {

    public void procesarEnvio(CanalMensajeria canal, String mensaje) {
        canal.enviar(mensaje);
    }
}
