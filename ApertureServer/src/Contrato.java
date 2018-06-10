import java.util.ArrayList;

public class Contrato {

    private Cliente cliente;
    private Server servidor;
    private String tipoDeContrato;
    private int tiempo;
    private ArrayList<Factura> facturas = new ArrayList<Factura>();

    public void establecerContrato(Cliente cliente, Server servidor, int tipoDeContrato, int tiempo){

    }
    public void renoverContrato(int tiempo){

    }

    public void cambiarTipo(String tipoDeContrato) {

    }
    public void eliminarContrato(Cliente cliente, Server servidor, Factura factura){

    }
}
