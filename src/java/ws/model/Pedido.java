package ws.model;


public class Pedido {
    private int id;
    private Medicamento medicamento;
    private int cantidad;
    private Sucursal sucursal;

    public Pedido() {
    }

    public Pedido(int id, Medicamento medicamento, int cantidad, Sucursal sucursal) {
        this.id = id;
        this.medicamento = new Medicamento(medicamento);
        this.cantidad = cantidad;
        this.sucursal = new Sucursal(sucursal);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    
}
