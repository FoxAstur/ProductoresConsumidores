/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import pasteleria.Pasteleria;

/**
 *
 * @author Carlos
 */
public class Comilon extends Thread {

    public ArrayBlockingQueue<Tarta> cintaPasteles;
    List<Comilon> comilones = new ArrayList<>();
    private int idComilon;
    private int tartasComidas;
    private int tiempoTartaComida;

    public Comilon(int idComilon, int tartasComidas, int tiempoTartaComida) {
        this.idComilon = idComilon;
        this.tartasComidas = tartasComidas;
        this.tiempoTartaComida = tiempoTartaComida;
    }

    public Comilon(int idComilon) {
        this.idComilon = idComilon;
    }

    public Comilon() {
    }

    public List<Comilon> getComilones() {
        return comilones;
    }

    public void añadeComilon(Comilon c) {
        comilones.add(c);
    }

    public void borraComilon(Comilon c) {
        comilones.remove(c);

    }

    public int getIdComilon() {
        return idComilon;
    }

    public void setIdComilon(int idComilon) {
        this.idComilon = idComilon;
    }

    public int getTartasComidas() {
        return tartasComidas;
    }

    public void setTartasComidas(int tartasComidas) {
        this.tartasComidas = tartasComidas;
    }

    public int getTiempoTartaComida() {
        return tiempoTartaComida;
    }

    public void setTiempoTartaComida(int tiempoTartaComida) {
        this.tiempoTartaComida = tiempoTartaComida;
    }

    public void comeTarta() {
        
        
        Tarta t = new Tarta();
        Pasteleria p = new Pasteleria();
        Comilon c = new Comilon();
        c.setIdComilon(idComilon++);
        c.setTartasComidas(c.getTartasComidas());
        c.setTiempoTartaComida(c.getTartasComidas());
        comilones.add(c);
  

        cintaPasteles = p.getCinta();

        if (cintaPasteles.peek() == null) {
            try {
                sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pasteleria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cintaPasteles.remove();
        System.out.println("Se ha comido una tarta");
        try {
            sleep(t.getTiempoDeConsumo());
        } catch (InterruptedException ex) {
            Logger.getLogger(Comilon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void run() {

        
        Comilon c = new Comilon();
        c.comeTarta();
        
    }

}
