package banco;

public class Cheque extends Cuenta {

    private int comision_chequera = 2000;
    private int comision_emision = 7000;

    public Cheque(int comision_chequera, int comision_emision, long no_de_cuenta, String nombre, int saldo) {
        super(no_de_cuenta, nombre, saldo);
        this.comision_chequera = comision_chequera;
        this.comision_emision = comision_emision;
    }

    @Override
    public void retirar(int retiro) {
        if(saldo < (retiro+comision_chequera))
            super.retirar(retiro+comision_chequera+comision_emision);
        else
            super.retirar(retiro+comision_chequera);
    }

    @Override
    public void depositar(int deposito) {
        super.depositar(deposito-comision_chequera);
    }    
}
