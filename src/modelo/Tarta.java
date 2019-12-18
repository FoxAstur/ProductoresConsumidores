
package modelo;

public class Tarta {
    
    private int tiempoDeProduccion;
    private int tiempoDeConsumo;
    private int peso;
    private int idTarta;

    public Tarta(int tiempoDeProduccion, int tiempoDeConsumo, int peso, int idTarta) {
        this.tiempoDeProduccion = tiempoDeProduccion;
        this.tiempoDeConsumo = tiempoDeConsumo;
        this.peso = peso;
        this.idTarta = idTarta;
    }

    public void setTiempoDeProduccion(int tiempoDeProduccion) {
        this.tiempoDeProduccion = tiempoDeProduccion;
    }

    public void setTiempoDeConsumo(int tiempoDeConsumo) {
        this.tiempoDeConsumo = tiempoDeConsumo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setIdTarta(int idTarta) {
        this.idTarta = idTarta;
    }
    
}

