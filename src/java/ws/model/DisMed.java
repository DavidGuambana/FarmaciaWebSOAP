package ws.model;

public class DisMed {
    private int id;
    private Distribuidor distribuidor;
    private Medicamento medicamento;

    public DisMed() {
    }

    public DisMed(int id, Distribuidor distribuidor, Medicamento medicamento) {
        this.id = id;
        this.distribuidor = new Distribuidor(distribuidor);
        this.medicamento = new Medicamento(medicamento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    
    
}
