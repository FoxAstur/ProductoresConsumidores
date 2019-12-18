/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class Comilon extends Thread {
    
    
    List <Comilon> comilones = new ArrayList<>();
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
    
    public void borraComilon (Comilon c){
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
    
    
}
