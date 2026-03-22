import java.util.Random;

/**
 * Clase que representa un sensor de aceleración en 3 ejes.
 */
public class SensorAceleracion extends Sensor {

    private double valorEjeX, valorEjeY, valorEjeZ;
    private Random rand = new Random();

    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "m/s^2");
    }

    /**
     * Genera lecturas de aceleración y calcula la magnitud.
     * 
     * @return Magnitud de la aceleración
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
