package banco;

public class Cheque extends Cuenta {

    private int comision_chequera;
    private int comision_emision;

    public Cheque(int no_de_cuenta, String nombre_cliente, int saldo) {
        super(no_de_cuenta, nombre_cliente, saldo);
    }
    
}
