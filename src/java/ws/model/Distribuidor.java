package ws.model;

import java.util.ArrayList;

public class Distribuidor {
    private int id;
    private String nombre;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();
    private ArrayList<Sucursal> sucursales = new ArrayList<>();

    public Distribuidor() {
    }

    public Distribuidor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Distribuidor(Distribuidor d) {
        this.id = d.getId();
        this.nombre = d.getNombre();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
   
    
}
