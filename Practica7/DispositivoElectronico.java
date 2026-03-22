/**
 * Clase base que representa un dispositivo electrónico genérico.
 * Contiene información básica como modelo, fabricante, consumo de energía y estado.
 */
public class DispositivoElectronico {

    /** Identificador del modelo del dispositivo */
    protected String modelo;

    /** Nombre del fabricante */
    protected String fabricante;

    /** Consumo de energía en watts */
    protected double consumoEnergia;

    /** Indica si el dispositivo está encendido */
    protected boolean encendido;

    /**
     * Constructor de la clase DispositivoElectronico.
     * 
     * @param modelo Modelo del dispositivo
     * @param fabricante Fabricante del dispositivo
     * @param consumoEnergia Consumo de energía en watts
     */
    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    /** Enciende el dispositivo */
    public void encender() {
        encendido = true;
        System.out.println(modelo + " encendido.");
    }

    /** Apaga el dispositivo */
    public void apagar() {
        encendido = false;
        System.out.println(modelo + " apagado.");
    }

    /**
     * Obtiene el estado actual del dispositivo.
     * 
     * @return Información del dispositivo y su estado
     */
    public String obtenerEstado() {
        return "Modelo: " + modelo +
               ", Fabricante: " + fabricante +
               ", Consumo: " + consumoEnergia + "W" +
               ", Estado: " + (encendido ? "Encendido" : "Apagado");
    }
}
