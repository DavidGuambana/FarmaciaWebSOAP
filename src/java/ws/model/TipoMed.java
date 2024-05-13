package ws.model;

import java.util.ArrayList;

public class TipoMed {
    private int id;
    private String tipo;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public TipoMed() {
    }

    
    public TipoMed(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    
     public TipoMed(TipoMed tm) {
        this.id = tm.getId();
        this.tipo = tm.getTipo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TipoMed{" + "id=" + id + ", tipo=" + tipo + '}';
    }
}
