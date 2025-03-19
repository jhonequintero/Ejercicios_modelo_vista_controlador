
package VISTA;

import MODELO.Temperatura;
import java.util.Scanner;


public class InterfazVista {
    private Scanner entrada; 
    private Temperatura objTemperatura;
    public InterfazVista(Temperatura estadoTemperatura){
        this.entrada= new Scanner(System.in);
        this.objTemperatura= estadoTemperatura;
    }
    
    public void TomarDatos(){
            System.out.println("ingrese la temperatura: ");
            int temperatura=entrada.nextInt();
            objTemperatura.setTemperatura(temperatura);

            System.out.println("ingrese la humedad: ");
            int humeda=entrada.nextInt();
            objTemperatura.setHumeda(humeda);
        
    }
    
}
