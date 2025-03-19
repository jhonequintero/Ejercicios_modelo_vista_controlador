
package CONTROLADOR;

import VISTA.InterfazVista;
import MODELO.Usuario;
import java.util.Scanner;


public class Controlador {
    private InterfazVista objInterfazVista;
    private Usuario objUsuario;
    private Scanner entrada;
    
    public Controlador(){
        this.entrada=new Scanner(System.in);
        this.objUsuario= new Usuario();
        this.objInterfazVista= new InterfazVista(objUsuario);
        
    }
    
    
    public void Iniciar(){
        while( true){
            objInterfazVista.TomarDatos();
            objUsuario.ImprimirDatos();
            if ( objUsuario.permitirAcceso()){
                objInterfazVista.MostrarMensaje("acesso permitido");
            }else{
                objInterfazVista.MostrarMensaje("aceso denegadoo");
            }
            
            
            
            objInterfazVista.MostrarMensaje("deseas agregar otro cliente ( true / false ) ");
            boolean continuar= entrada.nextBoolean();
            if (!continuar)break;
        }
        objInterfazVista.MostrarMensaje("saliendo es saliendo");
    }
    
}
