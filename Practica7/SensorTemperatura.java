import java.util.Random;

/**
 * Clase que representa un sensor de temperatura.
 */
public class SensorTemperatura extends Sensor {

    /** Último valor leído */
    private double valorActual;

    private Random rand = new Random();

    /**
     * Constructor del sensor de temperatura.
     */
    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "°C");
    }

    /**
     * Genera una lectura de temperatura simulada.
     * 
     * @return Valor de temperatura
     */
    @Override
    public double leerValor() {
        System.out.println("Leyendo temperatura...");
        valorActual = 20.0 + (35.0 - 20.0) * rand.nextDouble();
        return valorActual;
    }
}