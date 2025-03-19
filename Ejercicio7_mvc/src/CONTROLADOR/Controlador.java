
package CONTROLADOR;

import MODELO.Temperatura;
import VISTA.InterfazVista;
import java.util.Scanner;

public class Controlador {
    private Scanner entrada ;
    private Temperatura objTemperatura;
    private InterfazVista objInterfazVista;
    
    public  Controlador(){
        this.entrada= new Scanner(System.in);
        this.objTemperatura= new Temperatura();
        this.objInterfazVista=new InterfazVista(objTemperatura);
    }
    
    public int TomarCantidad(){
        System.out.println("--------BIENVENIDO A LA SIMULACIÓN DE AIRE ACONDICIONADO-------\n");
        System.out.println("Ingrese la cantidad de veces que quieres ingresar valores:");
        int iteraciones = entrada.nextInt();
        return iteraciones;
    }
    
    public void Inicar(int iteraciones){
         for (int i=0 ; i< iteraciones; i++){
             objInterfazVista.TomarDatos();
            objTemperatura.ActualizarEstado();
             System.out.println("Temperatura :" + objTemperatura.getTemperatura() + " Humedad : " + objTemperatura.getHumeda() + "  Aire Acondicionado Estado: " +  objTemperatura.ActualizarEstado());
   
            
        }
   
        
    }
    
}
