
package CONTROLADOR;

import MODELO.ControlDeLuces;
import VISTA.SistemaLuces;
import java.util.Scanner;


public class Controlador {
    private Scanner entrada;
  
    private ControlDeLuces objsensor1;
    private ControlDeLuces objsensor2;
    private ControlDeLuces objsensor3;
    
    private SistemaLuces objSistemaLuces;
  
    public Controlador(){
        this.entrada= new Scanner(System.in);
        this.objSistemaLuces= new SistemaLuces();
        this.objsensor1= new ControlDeLuces();
         this.objsensor2= new ControlDeLuces();
         this.objsensor3= new ControlDeLuces();
        
    }
    
    
    public void ValidarLuces(){
         int sensoresLuces = 0;
            if (objsensor1.getDetectarLuces()) sensoresLuces++;
            if (objsensor2.getDetectarLuces()) sensoresLuces++;
            if (objsensor3.getDetectarLuces()) sensoresLuces++;

            boolean EsdeNoche = true;
            if (sensoresLuces >= 2 && EsdeNoche) {
                objSistemaLuces.conMovimiento();
            } else {
                objSistemaLuces.sinmovimiento();
            }

    }
    
    
    
    public void Iniciar(){
        String continuar;
        do{
              try {
                Thread.sleep(10000); // Esperar 10 segundos antes de la medición
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
              
              objsensor1.ValidarLuces();
              objsensor2.ValidarLuces();
              objsensor3.ValidarLuces();
              
              objSistemaLuces.MostrarMensaje("Estados de sensores: ");
              objsensor1.MostrarEstado();
              objsensor2.MostrarEstado();
              objsensor3.MostrarEstado();
              
              ValidarLuces();
              
            objSistemaLuces.MostrarMensaje("quieres seguir midiendo la temperatura ( si / no ) ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("si"));
        objSistemaLuces.MostrarMensaje("saliendo es saliendo .....................");
        
    }
    
}
