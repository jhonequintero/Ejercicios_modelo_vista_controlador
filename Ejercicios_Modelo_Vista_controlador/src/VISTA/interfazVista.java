
package VISTA;

import java.util.Scanner;
import MODELO.Persona;
import MODELO.Sala;
import MODELO.Asientos;


public class interfazVista {
    private final Scanner entrada;
    private int  opcion1; 

    public  interfazVista() {
        this.entrada = new Scanner(System.in);
    }

    public Persona ingresarDatosPersona() {
        //obj persona 
        Persona objPersona = new Persona();
        
        System.out.print("Digite el nombre: ");
        String nombre=entrada.nextLine();
        objPersona.setNombre(nombre);
        
        System.out.print("Digite el apellido: ");
        String apellido=entrada.nextLine();
        objPersona.setApellido(apellido);
        
        System.out.print("Digite la cédula: ");
        String  cedula= entrada.nextLine();
        objPersona.setCedula(cedula);
        
        return objPersona;
    }

    public Sala ingresarDatosSala() {
       //obj sala
        Sala objSala = new Sala();
        
        System.out.print("Digite el ID de la sala: ");
        String idSala = entrada.nextLine();
        objSala.setIdSala(idSala);
        
        System.out.print("Digite el tipo de sala: ");
        String tipoSala=entrada.nextLine();
        objSala.setTipoSala(tipoSala);
        
        return objSala;
    }

    public int mostrarMenu() {
        System.out.println("------ MENÚ DE OPCIONES ------");
        System.out.println("1) Reservar asientos");
        System.out.println("2) Cancelar reserva");
        System.out.println("3) Ver estado de la sala");
        System.out.println("4) Salir");
        System.out.print("Seleccione una opción: ");
        opcion1=entrada.nextInt();
        entrada.nextLine();
        return  opcion1;
    }

    public int solicitarCantidad() {
        System.out.print("Ingrese cantidad de asientos a reservar: ");
        int cantidad= entrada.nextInt();
        entrada.nextLine();
        return cantidad;
    }
    
    
    
    public void Mostrarmensaje(String mensaje){
        System.out.println(mensaje);
    }
}
