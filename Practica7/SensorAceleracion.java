import java.util.Random;

/**
 * Representa un sensor de aceleración en tres ejes.
 * Calcula la magnitud de la aceleración.
 * 
 * @author Luis Galván
 * @version 1.0
 */
public class SensorAceleracion extends Sensor {

    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    private Random rand = new Random();

    /**
     * Constructor del sensor de aceleración.
     * 
     * @param modelo Modelo
     * @param fabricante Fabricante
     * @param consumoEnergia Consumo de energía
     */
    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "m/s^2");
    }

    /**
     * Genera valores aleatorios en los tres ejes y calcula la magnitud.
     * 
     * @return magnitud de la aceleración
     */
    @Override
    public double leerValor() {
        valorEjeX = -10 + 20 * rand.nextDouble();
        valorEjeY = -10 + 20 * rand.nextDouble();
        valorEjeZ = -10 + 20 * rand.nextDouble();

        System.out.println("Leyendo aceleración...");
        System.out.println("X: " + valorEjeX);
        System.out.println("Y: " + valorEjeY);
        System.out.println("Z: " + valorEjeZ);

        return Math.sqrt(valorEjeX * valorEjeX +
                         valorEjeY * valorEjeY +
                         valorEjeZ * valorEjeZ);
    }
}
