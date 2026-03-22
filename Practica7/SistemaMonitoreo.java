import java.util.ArrayList;

public class SistemaMonitoreo {
    public static void main(String[] args) {

        ArrayList<Sensor> listaSensores = new ArrayList<>();

        // Sensores de temperatura
        listaSensores.add(new SensorTemperatura("Sensor Temperatura 1 ", "Intel", 1.5));
        listaSensores.add(new SensorTemperatura("Sensor Temperatura 2 ", "AMD", 1.2));

        // Sensores de presión
        listaSensores.add(new SensorPresion("Sensor Presion 1 ", "Bosch", 2.0));
        listaSensores.add(new SensorPresion("Sensor Presion 2 ", "Honeywell", 2.1));

        // Sensores de aceleración
        listaSensores.add(new SensorAceleracion("Sensor Aceleracion 1 ", "Sony", 1.8));
        listaSensores.add(new SensorAceleracion("Sensor Aceleracion 2 ", "LG", 1.9));

        // Polimorfismo
        for (Sensor sensor : listaSensores) {
            System.out.println("\n-----------------------------");

            sensor.encender();
            sensor.calibrar();

            double valor = sensor.leerValor();

            String resultado = String.format("%.4f", valor);
            System.out.println("Resultado: " + resultado + " " + sensor.unidadMedida);
        }
    }
}