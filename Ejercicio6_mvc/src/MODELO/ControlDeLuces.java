
package MODELO;

import java.util.Random;


public class ControlDeLuces {
    private boolean DetectarLuces;
    private Random LucesRandom = new Random();

    public ControlDeLuces() {
        this.DetectarLuces = false;
    }

    public void ValidarLuces() {
        this.DetectarLuces = this.LucesRandom.nextBoolean(); // Ahora asigna el valor correctamente
    }

    public void setDetectarLuces(boolean luces) {
        this.DetectarLuces = luces;
    }

    public boolean getDetectarLuces() {
        return DetectarLuces;
    }

    public void MostrarEstado() {
        System.out.println("Detectando movimiento: " + this.getDetectarLuces());
    }
    
}
