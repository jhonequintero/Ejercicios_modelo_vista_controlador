package  MODELO;

public class Operacion {
   private Calculadora objCalculadora;
   
   public Operacion( Calculadora Calculadora){
       this.objCalculadora= Calculadora;
   }
   
   public void DeterminarOperacion(int opcion){

       switch (opcion) {
           case 1:
               objCalculadora.getSuma();
               System.out.println("resultado suma: " + objCalculadora.getSuma());
               break;
           case 2:
               objCalculadora.getResta();
               System.out.println("resultado resta: " + objCalculadora.getResta());
               break;
           case 3:
               objCalculadora.getMultiplicacion();
               System.out.println("resultado multiplicacion: " + objCalculadora.getMultiplicacion());
               break;
           case 4:
               objCalculadora.getDivision();
               System.out.println("resultado division: " + objCalculadora.getDivision());
               break;
           default:
               System.out.println("opcion invalidad....");
               break;
       }
    }
   
   
    
}
