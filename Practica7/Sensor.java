/**
 * Clase abstracta que representa un sensor genérico.
 * Define atributos y comportamientos comunes para todos los sensores.
 */
public abstract class Sensor extends DispositivoElectronico {

    /** Unidad de medida del sensor */
    protected String unidadMedida;

    /** Indica si el sensor está calibrado */
    protected boolean estaCalibrado;

    /**
     * Constructor de la clase Sensor.
     * 
     * @param modelo Modelo del sensor
     * @param fabricante Fabricante del sensor
     * @param consumoEnergia Consumo de energía
     * @param unidadMedida Unidad de medida
     */
    public Sensor(String modelo, String fabricante, double consumoEnergia, String unidadMedida) {
        super(modelo, fabricante, consumoEnergia);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = false;
    }

    /** Simula la calibración del sensor */
    public void calibrar() {
        estaCalibrado = true;
        System.out.println(modelo + " calibrado.");
    }

    /**
     * Método abstracto para leer el valor del sensor.
     * 
     * @return Valor leído por el sensor
     */
    public abstract double leerValor();
}
