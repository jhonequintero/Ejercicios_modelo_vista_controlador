
package  MODELO;

public class Sala {
    private String idSala;
    private String tipoSala;
    private Persona cliente;

    public Sala() {
        this.idSala = "";
        this.tipoSala = "";
        this.cliente = null;
    }

    
    public String getIdSala() {
        return idSala; 
    }
    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    
    public String getTipoSala() {
        return tipoSala;
    }
    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala; 
    }

    
    public Persona getCliente() {
        return cliente; 
    }
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    
}
