
package MODELO;

import java.util.Random;

public class SensorMovimiento {
     private boolean DectetarMovimiento;
    private  Random MovimientoRandom = new Random();
    
    public SensorMovimiento(){
        this.DectetarMovimiento=false;
    }
    
    
    public void DetetarMovimiento(){
        this.DectetarMovimiento= MovimientoRandom.nextBoolean();
    }
    
    
    public void setMovimiento(boolean  movimiento){
        this.DectetarMovimiento= movimiento;
    }
    
    
    public boolean hayMovimiento() {
            return DectetarMovimiento;
    }
    
    
 

    public void mostrarEstado() {
           System.out.println("Sensor detecta movimiento: " + this.hayMovimiento() );
    }
    
    
}
