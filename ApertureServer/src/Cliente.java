import java.util.ArrayList;

public class Cliente extends Usuario {

    private ArrayList<Server> servidores = new ArrayList<Server>();
    private String tarjetaCredito;
    private double saldo;

    private void validarTarjetaCredito(){

    }

    public double comprobarSaldo(){
        return saldo;
    }
    public void comprarServidor(Server servidor){

    }
    public void accederServidor(){

    }
    public void quitarServidor(Server servidor){

    }

}
