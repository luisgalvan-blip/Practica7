import java.util.Random;

/**
 * Representa un sensor de temperatura.
 * Genera valores aleatorios dentro de un rango específico.
 * 
 * @author Luis Galván
 * @version 1.0
 */
public class SensorTemperatura extends Sensor {

    /** Último valor leído de temperatura */
    private double valorActual;

    private Random rand = new Random();

    /**
     * Constructor del sensor de temperatura.
     * 
     * @param modelo Modelo del sensor
     * @param fabricante Fabricante
     * @param consumoEnergia Consumo de energía
     */
    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "°C");
    }

    /**
     * Genera una lectura de temperatura simulada.
     * 
     * @return valor de temperatura
     */
    @Override
    public double leerValor() {
        System.out.println("Leyendo temperatura...");
        valorActual = 20.0 + (35.0 - 20.0) * rand.nextDouble();
        return valorActual;
    }
}