
package MODELO;

public class Temperatura {
     private int temperatura;
     private int humeda;
     private boolean  encendido;

    public Temperatura() {
        this.temperatura = 0;
        this.humeda = 0;
        this.encendido=false;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getHumeda() {
        return humeda;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setHumeda(int humeda) {
        this.humeda = humeda;
    }
   
      public String Estado(){
        if (encendido){
            return "el aire esta encendido......";
        }
        else{
            return  "el aire esta apagadoooo.....";
            
        }
    }
      
       public void setEstado(boolean estado){
        this.encendido=estado;
        
    }
   
    public String  ActualizarEstado() {
        if ((this.getTemperatura() > 28 && this.getHumeda() > 60) || temperatura > 30) {
            setEstado(true);
        } else {
            setEstado(false);
        }
        return Estado();
    }

    

   
}
