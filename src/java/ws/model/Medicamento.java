package ws.model;

public class Medicamento {
    private int id;
    private String medicamento;
    private double precio;
    private int stock;
    private TipoMed tipo_med;
    private DisMed dis_med;

    public Medicamento() {
    }

    public Medicamento(int id, String medicamento, double precio, int stock, TipoMed tipo_med) {
        this.id = id;
        this.medicamento = medicamento;
        this.precio = precio;
        this.stock = stock;
        this.tipo_med = new TipoMed(tipo_med);
    }
    
    public Medicamento(Medicamento m) {
        this.id = m.getId();
        this.medicamento = m.getMedicamento();
        this.precio = m.precio;
        this.stock = m.getStock();
        this.tipo_med = m.getTipo_med();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public TipoMed getTipo_med() {
        return tipo_med;
    }

    public void setTipo_med(TipoMed tipo_med) {
        this.tipo_med = tipo_med;
    }

    
    
}
