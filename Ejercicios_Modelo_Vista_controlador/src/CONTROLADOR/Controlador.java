package CONTROLADOR;

import MODELO.Asientos;
import MODELO.Persona;
import MODELO.Sala;
import VISTA.interfazVista;

public class Controlador {
    private interfazVista objVista;
    private Asientos objAsientos;
    private Sala objSala;
    private Persona objPersona;  

    public Controlador() {  
        this.objVista = new interfazVista();
        this.objAsientos = new Asientos();
    }

    public void iniciar() {
        objPersona = objVista.ingresarDatosPersona();
        objSala = objVista.ingresarDatosSala();
        objSala.setCliente(objPersona);

        int opcion;
        do {
            opcion = objVista.mostrarMenu();
            switch (opcion) {
                case 1:
                    int cantidadReservar = objVista.solicitarCantidad();
                    objAsientos.reservarAsientos(cantidadReservar);
                    break;
                case 2:
                    int cantidadCancelar = objVista.solicitarCantidad();
                    objAsientos.cancelarReservas(cantidadCancelar);
                    break;
                case 3:
                    objVista.Mostrarmensaje("------ESTADO DE LA SALA-------");
                    objVista.Mostrarmensaje("Id sala: " + objSala.getIdSala() +  " --" +  "Tipo de sala: " + objSala.getTipoSala());
                    objVista.Mostrarmensaje("Cliente: " + objPersona.getNombre() + "--" + objPersona.getApellido());
                    objVista.Mostrarmensaje("Asientos disponibles: " + objAsientos.getAsientosDisponibles());
                    objVista.Mostrarmensaje("Asientos reservados: " + objAsientos.getTotalReservas());
                    break;
                case 4:
                    objVista.Mostrarmensaje("Saliendo...");
                    break;
                default:
                    objVista.Mostrarmensaje("Opción inválida...");
            }
        } while (opcion != 4);
    }
}
