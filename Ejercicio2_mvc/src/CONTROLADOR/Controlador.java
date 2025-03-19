
package CONTROLADOR;


public class Controlador {
    
      public void validarReglaFizzBuzz(){
        for (int i=1; i <= 100; i++){
            if ((i % 5==0 ) && (i %3==0)){
                System.out.println(i+ "FIZZBUZZ");
            }
            
            else if (i % 3==0) {
                System.out.println(i+  " FIZZ");
                
            } 
            else if (i%5==0){
                System.out.println(i+ " BUZZZ");
                
            }
            
            
            else {
                System.out.println(i);
                
            }
              
        }
    }
    
}


