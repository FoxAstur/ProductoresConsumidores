
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Pastelero extends Thread {

    private List<Pastelero> pasteleros = new ArrayList<>();
    private int idPastelero;
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

    public void borraPastelero(Pastelero p) {

    }

    public void run() {

    }

}
