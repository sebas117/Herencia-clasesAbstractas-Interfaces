package banco;

public class Cuenta {

    protected long no_de_cuenta;
    protected String nombre;
    protected int saldo;

    public Cuenta(long no_de_cuenta, String nombre, int saldo) {
        this.no_de_cuenta = no_de_cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public long getNo_de_cuenta() {
        return no_de_cuenta;
    }
    
    public void consultarDatos() { //imprime propiedades
        System.out.println("Soporte{" + "no de cuenta=" + no_de_cuenta + ", nombre=" + nombre + ", saldo=" + saldo + "}");
    }

    public void depositar(int deposito) {
        saldo = +deposito;
    }

    public void retirar(int retiro) {
        if (saldo >= retiro) {
            saldo -= retiro;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
