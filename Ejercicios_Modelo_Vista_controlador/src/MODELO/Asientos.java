
package MODELO;

public class Asientos {
    private int asientosDisponibles;
    private int totalReservas;

    public Asientos() {
        this.asientosDisponibles = 100;
        this.totalReservas = 0;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }
    public int getTotalReservas()  {
        return totalReservas;
    }

    public void reservarAsientos(int cantidad) {
        if (cantidad > this.getAsientosDisponibles()) {
            System.out.println("No hay suficientes asientos disponibles: " + this.getAsientosDisponibles());
        } else {
            asientosDisponibles -= cantidad;
            totalReservas += cantidad;
            System.out.println("Reserva exitosa. Has reservado " + cantidad + " asientos.");
        }
    }

    public void cancelarReservas(int cantidad) {
        if (cantidad > this.getTotalReservas()) {
            System.out.println("No puedes cancelar más asientos de los reservados.");
        } else {
            asientosDisponibles += cantidad;
            totalReservas -= cantidad;
            System.out.println("Cancelación exitosa. Se cancelaron " + cantidad + " asientos.");
        }
    }
}
