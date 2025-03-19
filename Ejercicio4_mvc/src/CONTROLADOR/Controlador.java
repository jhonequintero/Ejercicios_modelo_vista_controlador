
package CONTROLADOR;

import MODELO.SensorTemperatura;
import VISTA.Calefactor;
import VISTA.InterfazVista;
import VISTA.Ventilador;
import java.util.Scanner;

public class Controlador {
    private Scanner entrada ;
    private SensorTemperatura objSensorTemperatura;
    private InterfazVista objInterfazVista;
    private Calefactor objCalefactor;
    private Ventilador objVentilador;
    
            
    
    public Controlador(){
        this.entrada= new Scanner(System.in);
        this.objSensorTemperatura= new SensorTemperatura();
        this.objInterfazVista= new InterfazVista();
        this.objCalefactor= new Calefactor();
        this.objVentilador= new Ventilador();
        
    }
    
    public void verificarClima() {
        objSensorTemperatura.MedirTemperatura();
        int temperatura = objSensorTemperatura.getTemperatura();

        if (temperatura < 10) {
            objCalefactor.encender();
            objVentilador.apagar();
        } else if (temperatura > 25) {
            objVentilador.encender();
            objCalefactor.apagar();
        } else {
            System.out.println(" Temperatura estable .... apagandoo sistemas");
            objCalefactor.apagar();
            objVentilador.apagar();
        }
    }
    
    public void Iniciar(){
        String continuar;
        do{
            try {
                Thread.sleep(5000); // Esperar 5 segundos antes de la medición
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            verificarClima();
            
            
            objInterfazVista.Mostrarmnesaje("quieres seguir midiendo la temperatura ( si / no ) ");
            continuar=entrada.nextLine();
        } while (continuar.equalsIgnoreCase("si"));
    }
    
    
    
}
