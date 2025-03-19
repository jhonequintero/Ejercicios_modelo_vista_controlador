package MODELO;

public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public void setNumeros(int num1, int num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public int getSuma() {
        return numero1 + numero2;
    }

    public int getResta() {
        return numero1 - numero2;
    }

    public int getMultiplicacion() {
        return numero1 * numero2;
    }

    public int getDivision() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("️ Error: No se puede dividir por cero.");
            return 0;
        }
    }
}
