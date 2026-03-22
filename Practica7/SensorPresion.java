import java.util.Random;

/**
 * Representa un sensor de presión atmosférica.
 * 
 * @author Luis Galván
 * @version 1.0
 */
public class SensorPresion extends Sensor {

    /** Último valor leído de presión */
    private double valorActual;

    private Random rand = new Random();

    /**
     * Constructor del sensor de presión.
     * 
     * @param modelo Modelo
     * @param fabricante Fabricante
     * @param consumoEnergia Consumo de energía
     */
    public SensorPresion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "hPa");
    }

    /**
     * Genera una lectura de presión simulada.
     * 
     * @return valor de presión
     */
    @Override
    public double leerValor() {
        System.out.println("Leyendo presión...");
        valorActual = 900.0 + (1100.0 - 900.0) * rand.nextDouble();
        return valorActual;
    }
}