
package VISTA;

import java.util.Scanner;
import  MODELO.Calculadora;
import  MODELO.EntradaUsuario;


public class InterfazVista {
    private final Scanner entrada;
    private EntradaUsuario objEntradaUsuario;
  
    
    public InterfazVista(){
        this.entrada=new Scanner(System.in);
        this.objEntradaUsuario= new EntradaUsuario();
                
    }
    
      public EntradaUsuario TomarDatos(){
            System.out.println("\n----BIENVENIDOS AL MENU DE CALCULOS-------\n");
            System.out.println("ingrese el primer numero:");
            int numero1= entrada.nextInt();
            objEntradaUsuario.setNumero1(numero1);
            
            System.out.println("ingrese el segundo numero: ");
            int numero2= entrada.nextInt();
            objEntradaUsuario.setNumero2(numero2);
            
            return  objEntradaUsuario;
      }
      
      
      public int  OperacionHacer(){
        int opcion;
        System.out.println("\n------MENU DE OPERACIONES------\n");
        System.out.println("1) suma");
        System.out.println("2) resta ");
        System.out.println("3) multiplicacion ");
        System.out.println("4) division..");
        System.out.println("ingrese la opcion que deseas realizar ");
        opcion=entrada.nextInt();
        return opcion; 
        
    }
      
      
      
      public void MostrarMensaje(String mensaje){
          System.out.println(mensaje);
          
      }
    
    
}
