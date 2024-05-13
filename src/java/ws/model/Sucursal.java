package ws.model;

public class Sucursal {
    private int id;
    private String tipo;
    private String direccion;
    private Distribuidor distribuidor;

    public Sucursal() {
    }

    public Sucursal(int id, String tipo, String direccion, Distribuidor distribuidor) {
        this.id = id;
        this.tipo = tipo;
        this.direccion = direccion;
        this.distribuidor = new Distribuidor(distribuidor);
    }
    
    public Sucursal(Sucursal s) {
        this.id = s.getId();
        this.tipo = s.getTipo();
        this.direccion = s.getDireccion();
        this.distribuidor = s.getDistribuidor();
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    
}
