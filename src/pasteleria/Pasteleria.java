
package pasteleria;


import java.util.concurrent.ArrayBlockingQueue;
import modelo.Tarta;


public class Pasteleria {

    public ArrayBlockingQueue<Tarta> cinta = new ArrayBlockingQueue<>(30);
    public static final int NUM_COMILONES = 2;
    public static final int NUM_PASTELEROS = 3;
    public static final int TARTAS_A_PRODUCIR = 20;
    
    public static int tartasProducidas;
    public static int tartasComidas;

    public void añadeTarta(Tarta t) {
       
        cinta.add(t);
    }

    public void comeTarta(Tarta t){
        
        cinta.remove();
        
    }
    
    
    //Me he quedado aqui
    public void compruebaSiSePuedeComerTarta(){
        
        if(cinta.peek()==null){
            
        }
        
    }
    
    public static void setTartasProducidas(int tartasProducidas) {
        Pasteleria.tartasProducidas = tartasProducidas;
    }

    public static void setTartasComidas(int tartasComidas) {
        Pasteleria.tartasComidas = tartasComidas;
    }
    
    
    
}
