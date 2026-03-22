import java.util.Random;

/**
 * Clase que representa un sensor de presión.
 */
public class SensorPresion extends Sensor {

    private double valorActual;
    private Random rand = new Random();

    public SensorPresion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "hPa");
    }

    /**
     * Genera una lectura de presión simulada.
     * 
     * @return Valor de presión
     */
    @Override
    public double leerValor() {
        System.out.println("Leyendo presión...");
        valorActual = 900.0 + (1100.0 - 900.0) * rand.nextDouble();
        return valorActual;
    }
}