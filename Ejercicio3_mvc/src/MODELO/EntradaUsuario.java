
package MODELO;



public class EntradaUsuario {
    private  int numero1;
    private int numero2;
    
    public EntradaUsuario(){
        this.numero1=0;
        this.numero2=0;
    }
    
    public int getNumero1(){
        return  numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    
    public void setNumero1(int numero1){
        this.numero1=numero1;
    }
    
    public void setNumero2(int numero2){
        this.numero2=numero2;
    }
    
    public void imprimirDatos(){
        System.out.println("\n-----NUMEROS INGRESADOS-------\n");
        System.out.println("numero 1: " + this.getNumero1());
        System.out.println("numero 2: " +  this.getNumero2());
    }
    
  
    
}
