
package CONTROLADOR;

import java.util.Scanner;
import  MODELO.EntradaUsuario;
import  MODELO.Calculadora;
import MODELO.Operacion;
import VISTA.InterfazVista;


public class Controlador {
        private Scanner entrada;
        private  EntradaUsuario objEntradaUsuario;
        private Calculadora objCalculadora;
        private Operacion objOperacion;
        private InterfazVista objInterfazVista;
        
        
        
    public Controlador(){
         this.entrada=new Scanner(System.in);
         this.objEntradaUsuario= new EntradaUsuario();
        this.objCalculadora= new Calculadora();
        this.objOperacion= new Operacion( objCalculadora);
        this.objInterfazVista= new InterfazVista();
    }
    
    
    public void   Iniciar(){
        
        String continuar;
        do{
              objEntradaUsuario= objInterfazVista.TomarDatos();
               objEntradaUsuario.imprimirDatos();
               
               int opcion =objInterfazVista.OperacionHacer();
                      // Pasamos los datos de EntradaUsuario a Calculadora
            objCalculadora.setNumeros(objEntradaUsuario.getNumero1(), objEntradaUsuario.getNumero2());
            
               objOperacion.DeterminarOperacion(opcion);
            
            
            
                 objInterfazVista.MostrarMensaje("deseas hacer otra operacion ( si / no ) ");
                 continuar=entrada.next();
        }while(continuar.equalsIgnoreCase("si"));
            
        objInterfazVista.MostrarMensaje("saliendo del programa gracias por utilizarlo.....");
        
        
    }
}
