
package CONTROLADOR;

import VISTA.Alarma;
import MODELO.SensorMovimiento;


public class Controlador {
        private Alarma objAlarma;
        SensorMovimiento objMovimiento1 ;
        SensorMovimiento objMovimiento2 ;
        SensorMovimiento objMovimiento3 ;
    public Controlador(){
        this.objAlarma= new Alarma();
        this.objMovimiento1= new SensorMovimiento();
        this.objMovimiento2= new SensorMovimiento();
        this.objMovimiento3= new SensorMovimiento();
    
    }
    
    public void VerificarSensores(){
            int sensoresActivos = 0;
            if ( objMovimiento1.hayMovimiento()) sensoresActivos++;
            if(objMovimiento2.hayMovimiento()) sensoresActivos++;
            if (objMovimiento3.hayMovimiento()) sensoresActivos++;
            
            boolean EsDeNoche= true;
            if (sensoresActivos >= 2 && EsDeNoche ){
                objAlarma.ActivandoAlarma();
            }   
            else{
                objAlarma.AlarmaNormal();
            }
    }
    
    public void Iniciar(){
       
        
        objMovimiento1.DetetarMovimiento();
        objMovimiento2.DetetarMovimiento();
        objMovimiento3.DetetarMovimiento();
        
        objAlarma.MostrarMensaje("Estado de los sensores: ");
        objMovimiento1.mostrarEstado();
        objMovimiento2.mostrarEstado();
        objMovimiento3.mostrarEstado();
        
        VerificarSensores();
    }
    
    
}
