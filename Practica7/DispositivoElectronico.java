/**
 * Representa un dispositivo electrónico genérico dentro del sistema.
 * Contiene información básica como modelo, fabricante, consumo de energía y estado.
 * 
 * @author Luis Galván
 * @version 1.0
 */
public class DispositivoElectronico {

    /** Modelo del dispositivo */
    private String modelo;

    /** Nombre del fabricante */
    private String fabricante;

    /** Consumo de energía en watts */
    private double consumoEnergia;

    /** Indica si el dispositivo está encendido */
    private boolean encendido;

    /**
     * Constructor que inicializa los atributos del dispositivo.
     * 
     * @param modelo Identificador del modelo
     * @param fabricante Nombre del fabricante
     * @param consumoEnergia Consumo de energía en watts
     */
    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    /**
     * Enciende el dispositivo.
     */
    public void encender() {
        encendido = true;
        System.out.println(modelo + " encendido.");
    }

    /**
     * Apaga el dispositivo.
     */
    public void apagar() {
        encendido = false;
        System.out.println(modelo + " apagado.");
    }

    /**
     * Obtiene el estado actual del dispositivo.
     * 
     * @return Cadena con la información del dispositivo y su estado
     */
    public String obtenerEstado() {
        return "Modelo: " + modelo +
               ", Fabricante: " + fabricante +
               ", Consumo: " + consumoEnergia + "W" +
               ", Estado: " + (encendido ? "Encendido" : "Apagado");
    }

    /**
     * Obtiene el modelo del dispositivo.
     * 
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene el fabricante del dispositivo.
     * 
     * @return fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Obtiene el consumo de energía.
     * 
     * @return consumo de energía
     */
    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    /**
     * Indica si el dispositivo está encendido.
     * 
     * @return true si está encendido, false en caso contrario
     */
    public boolean isEncendido() {
        return encendido;
    }
}
