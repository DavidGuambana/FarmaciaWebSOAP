package principal;

import java.util.ArrayList;
import ws.model.DisMed;
import ws.model.Distribuidor;
import ws.model.Medicamento;
import ws.model.Pedido;
import ws.model.Sucursal;
import ws.model.TipoMed;

public class Principal {

    public static ArrayList<Medicamento> medicamentos;
    public static ArrayList<Distribuidor> distribuidores;
    public static ArrayList<Sucursal> sucursales;
    public static ArrayList<TipoMed> tipos_medic;
    public static ArrayList<Pedido> pedidos;
    public static ArrayList<DisMed> distribuidores_medicamentos;

    public static void crearDatos() {
        //TIPOS MEDICAMENTO:
        TipoMed t1 = new TipoMed(1, "analgésico");
        TipoMed t2 = new TipoMed(1, "analéptico");
        TipoMed t3 = new TipoMed(1, "anestésico");
        TipoMed t4 = new TipoMed(1, "antiácido");
        TipoMed t5 = new TipoMed(1, "antidepresivo");
        TipoMed t6 = new TipoMed(1, "antibióticos");
        tipos_medic = new ArrayList<>();
        tipos_medic.add(t1);
        tipos_medic.add(t2);
        tipos_medic.add(t3);
        tipos_medic.add(t4);
        tipos_medic.add(t5);
        tipos_medic.add(t6);
        
        //DISTRIBUIDORES
        Distribuidor d1 = new Distribuidor(1, "COFARMA");
        Distribuidor d2 = new Distribuidor(2, "EMPSEPHAR");
        Distribuidor d3 = new Distribuidor(3, "CEMEFAR");
        distribuidores = new ArrayList<>();
        distribuidores.add(d1);
        distribuidores.add(d2);
        distribuidores.add(d3);
        
        //MEDICAMENTOS
        Medicamento m1 = new Medicamento(1, "Paracetamol", 2.0, 50, t1);
        Medicamento m2 = new Medicamento(2, "Ibuprofeno", 1.5, 40, t2);
        Medicamento m3 = new Medicamento(3, "Aspirina ", 3.20, 50, t3);
        Medicamento m4 = new Medicamento(4, "Omeprazol ", 4.0, 40, t4);
        Medicamento m5 = new Medicamento(5, "Amoxicilina ", 1.3, 50, t5);
        Medicamento m6 = new Medicamento(6, "Simvastatina   ", 1.2, 10, t6);
        Medicamento m7 = new Medicamento(7, "Metformina", 1.0, 50, t1);
        Medicamento m8 = new Medicamento(8, "Ciprofloxacino", 3, 25, t2);
        medicamentos = new ArrayList<>();
        medicamentos.add(m1);
        medicamentos.add(m2);
        medicamentos.add(m3);
        medicamentos.add(m4);
        medicamentos.add(m5);
        medicamentos.add(m6);
        medicamentos.add(m7);
        medicamentos.add(m8);
        
        //DISTRIBUIDOR_MEDICAMENTOS:
        DisMed dm1 = new DisMed(1, d1, m1);
        DisMed dm2 = new DisMed(1, d1, m2);
        DisMed dm3 = new DisMed(1, d1, m3);
        DisMed dm4 = new DisMed(2, d2, m1);
        DisMed dm5 = new DisMed(2, d2, m2);
        DisMed dm6 = new DisMed(2, d3, m3);
        distribuidores_medicamentos = new ArrayList<>();
        distribuidores_medicamentos.add(dm1);
        distribuidores_medicamentos.add(dm2);
        distribuidores_medicamentos.add(dm3);
        distribuidores_medicamentos.add(dm4);
        distribuidores_medicamentos.add(dm5);
        distribuidores_medicamentos.add(dm6);
        
        //SUCURSAL:
        Sucursal s1 = new Sucursal(1, "PRINCIPAL", "Octavio Chacón Moscoso", d1);
        Sucursal s2 = new Sucursal(1, "SECUNDARIA", "Calle AV de la Independencia", d1);
        Sucursal s3 = new Sucursal(1, "PRINCIPAL", "Octavio Chacón Moscoso", d2);
        Sucursal s4 = new Sucursal(1, "SECUNDARIA", "Calle AV de la Independencia", d2);
        sucursales = new ArrayList<>();
        sucursales.add(s1);
        sucursales.add(s2);
        sucursales.add(s3);
        sucursales.add(s4);
        
        //PEDIDO:
        Pedido p1 = new Pedido(1, m1, 4, s4);
        Pedido p2 = new Pedido(2, m1, 2, s4);
        Pedido p3 = new Pedido(3, m2, 2, s4);
        Pedido p4 = new Pedido(4, m2, 3, s4);
        
        
    }
}
