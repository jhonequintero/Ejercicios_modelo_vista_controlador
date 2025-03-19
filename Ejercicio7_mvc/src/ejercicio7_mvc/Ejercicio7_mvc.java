
package ejercicio7_mvc;

import  CONTROLADOR.Controlador;
public class Ejercicio7_mvc {

    public static void main(String[] args) {
        Controlador  objcontrolador = new Controlador();
        int iteraciones = objcontrolador.TomarCantidad();
        objcontrolador.Inicar(iteraciones);

    }
    
}
