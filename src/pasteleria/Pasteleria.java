package pasteleria;

import java.util.concurrent.ArrayBlockingQueue;
import modelo.Comilon;
import modelo.Pastelero;

import modelo.Tarta;

public class Pasteleria {

    public ArrayBlockingQueue<Tarta> cinta = new ArrayBlockingQueue<>(30);
    public static final int NUM_COMILONES = 2;
    public static final int NUM_PASTELEROS = 3;
    public static final int TARTAS_A_PRODUCIR = 20;

    public static int tartasProducidas;
    public static int tartasComidas;

    public static int getTARTAS_A_PRODUCIR() {
        return TARTAS_A_PRODUCIR;
    }

    public static void setTartasProducidas(int tartasProducidas) {
        Pasteleria.tartasProducidas = tartasProducidas;
    }

    public static void setTartasComidas(int tartasComidas) {
        Pasteleria.tartasComidas = tartasComidas;
    }

    public ArrayBlockingQueue<Tarta> getCinta() {

        return cinta;

    }

    public void abierta() {

        Pastelero p = new Pastelero();
        Comilon c = new Comilon();

        c.start();
        p.start();

    }

}
