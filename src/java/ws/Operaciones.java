package ws;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import principal.Principal;
import ws.model.Medicamento;
import ws.model.Pedido;

@WebService(serviceName = "Operaciones")
public class Operaciones {

    public Operaciones() {
        Principal.crearDatos();
    }

    @WebMethod(operationName = "setMedicamento")
    public Boolean setMedicamento(@WebParam(name = "medicamento") Medicamento medicamento) {
        try {
            Principal.medicamentos.add(medicamento);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @WebMethod(operationName = "getMedicamentos")
    public ArrayList<Medicamento> getMedicamento() {
        System.out.println(Principal.medicamentos);
        return Principal.medicamentos;
    }

    @WebMethod(operationName = "deleteMedicamento")
    public Boolean deleteMedicamento(@WebParam(name = "medicamento") Medicamento medicamento) {
        try {
            Principal.medicamentos.remove(medicamento);
            return true;
        } catch (Exception e) {
            return false; // Manejar cualquier excepción
        }
    }
    
    @WebMethod(operationName = "setPedido")
    public Boolean setPedido(@WebParam(name = "medicamento") Pedido pedido) {
        try {
            Principal.pedidos.add(pedido);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
