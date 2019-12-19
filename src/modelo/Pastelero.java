package modelo;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import pasteleria.Pasteleria;
import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

public class Pastelero extends Thread {

    public ArrayBlockingQueue<Tarta> cintaPasteleria;
    private List<Pastelero> pasteleros = new ArrayList<>();
    private static int idPastelero = 0;
    private int tartasProducidas;
    private int tiempoTartaProducida;

    public Pastelero(int idPastelero) {
        this.idPastelero = idPastelero;
    }

    public Pastelero() {
    }

    public int getIdPastelero() {
        return idPastelero;
    }

    public void setIdPastelero(int idPastelero) {
        this.idPastelero = idPastelero;
    }

    public int getTartasProducidas() {
        return tartasProducidas;
    }

    public void setTartasProducidas(int tartasProducidas) {
        this.tartasProducidas = tartasProducidas;
    }

    public int getTiempoTartaProducida() {
        return tiempoTartaProducida;
    }

    public void setTiempoTartaProducida(int tiempoTartaProducida) {
        this.tiempoTartaProducida = tiempoTartaProducida;
    }

    public List<Pastelero> getPasteleros() {
        return pasteleros;
    }

    public void añadePastelero(Pastelero p) {
        pasteleros.add(p);
    }

    public Tarta creaTarta() {

        Pastelero pastelero = new Pastelero(idPastelero++);
        pasteleros.add(this);

        Random random = new Random(System.currentTimeMillis());
        int PesoTiempoProduccionYTiempoEnComer = random.nextInt(500) + 500;

        Tarta tarta = new Tarta(PesoTiempoProduccionYTiempoEnComer, PesoTiempoProduccionYTiempoEnComer, PesoTiempoProduccionYTiempoEnComer, idPastelero);

        pastelero.setTartasProducidas(tartasProducidas++);

        System.out.println("Se ha creado una tarta");
        return tarta;

    }

    public void añadeTarta(Tarta t) {

        Pasteleria p = new Pasteleria();

        cintaPasteleria = p.getCinta();

        if (p.getTARTAS_A_PRODUCIR() < 20) {
            if (cintaPasteleria.peek() == null) {
                try {
                    sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Pasteleria.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                cintaPasteleria.add(t);
                System.out.println("Se ha añadido una tarta");
            }
        } else {
            System.out.println("Ya se han producido 20 tartas");
        }
    }

    public void run() {

        Pastelero p = new Pastelero();

        p.añadeTarta(p.creaTarta());

    }

}
