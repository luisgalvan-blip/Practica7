/**
 * Clase abstracta que representa un sensor genérico.
 * Define atributos y comportamientos comunes para todos los sensores.
 * 
 * @author Luis Galván
 * @version 1.0
 */
public abstract class Sensor extends DispositivoElectronico {

    /** Unidad de medida del sensor */
    private String unidadMedida;

    /** Indica si el sensor está calibrado */
    private boolean estaCalibrado;

    /**
     * Constructor del sensor.
     * 
     * @param modelo Modelo del sensor
     * @param fabricante Fabricante del sensor
     * @param consumoEnergia Consumo de energía
     * @param unidadMedida Unidad de medida del sensor
     */
    public Sensor(String modelo, String fabricante, double consumoEnergia, String unidadMedida) {
        super(modelo, fabricante, consumoEnergia);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = false;
    }

    /**
     * Simula la calibración del sensor.
     */
    public void calibrar() {
        estaCalibrado = true;
        System.out.println(getModelo() + " calibrado.");
    }

    /**
     * Método abstracto que obtiene el valor medido por el sensor.
     * 
     * @return valor medido
     */
    public abstract double leerValor();

    /**
     * Obtiene la unidad de medida del sensor.
     * 
     * @return unidad de medida
     */
    public String getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Indica si el sensor está calibrado.
     * 
     * @return true si está calibrado
     */
    public boolean isEstaCalibrado() {
        return estaCalibrado;
    }
}
