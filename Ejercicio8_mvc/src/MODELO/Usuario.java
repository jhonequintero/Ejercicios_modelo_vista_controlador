
package MODELO;


public class Usuario {
    private boolean  TieneMembresia;
    private boolean  EsEmpleado;
    private boolean HorarioAtencion;

    
    public Usuario(){
        this.TieneMembresia=false;
        this.EsEmpleado=false;
        this.HorarioAtencion=false;
        
    }

    public boolean getTieneMembresia() {
        return TieneMembresia;
    }

    public void setTieneMembresia(boolean TieneMembresia) {
        this.TieneMembresia = TieneMembresia;
    }

    public boolean getEsEmpleado() {
        return EsEmpleado;
    }

    public void setEsEmpleado(boolean EsEmpleado) {
        this.EsEmpleado = EsEmpleado;
    }
    
    
    public void ImprimirDatos(){
        System.out.println("------Datos--------");
        System.out.println("Menbresia " + this.getTieneMembresia());
        System.out.println("Empleado " + this.getEsEmpleado());
    }
    
      public boolean permitirAcceso() {
        if (this.getTieneMembresia() || this.getEsEmpleado()) {
            return true;
        }
        return false;
    }
    
    
    
}
