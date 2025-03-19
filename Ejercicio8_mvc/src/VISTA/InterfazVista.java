
package VISTA;

import MODELO.Usuario;
import java.util.Scanner;

public class InterfazVista {
        private Scanner entrada;
        private Usuario objUsuario;
        
        public InterfazVista(Usuario datosUsuario){
            this.entrada= new Scanner(System.in);
            this.objUsuario=datosUsuario;
            
        }
        
        
    public void TomarDatos(){
        System.out.println("Nuevo cliente ");
        
        System.out.println("tienes menbresia ( true / false ) ");
        boolean TieneMenbresia= entrada.nextBoolean();
        objUsuario.setTieneMembresia(TieneMenbresia);
        
        System.out.println("eres empleado  ( true / false ) ");
        boolean esEmpleado=entrada.nextBoolean();
        objUsuario.setEsEmpleado(esEmpleado);
     
    }
    
    public void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
}
