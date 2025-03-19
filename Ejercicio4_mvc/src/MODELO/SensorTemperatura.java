
package MODELO;

import java.util.Random;

public class SensorTemperatura {
    private int temperatura;
    private Random munRandom ; 
     
    public SensorTemperatura(){
        this.temperatura=0;
        this.munRandom = new Random();
         
    }
    
    public int getTemperatura(){
        return  temperatura;
    }
    
    public void MedirTemperatura(){
        this.temperatura=munRandom.nextInt(31);
        System.out.println("Temperatura actual: " + this.getTemperatura() +  " °C");
    }
    
}
