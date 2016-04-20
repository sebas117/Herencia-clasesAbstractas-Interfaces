package banco;

public class Cuenta {

    protected int no_de_cuenta;
    protected String nombre_cliente;
    protected int saldo;

    public Cuenta(int no_de_cuenta, String nombre_cliente, int saldo) {
        this.no_de_cuenta = no_de_cuenta;
        this.nombre_cliente = nombre_cliente;
        this.saldo = saldo;
    }
    
  
    public void consultarDatos(){ //imprime propiedades
    }
    
    public void depositar(int deposito){
        this.saldo =+ deposito;
    }
    
    public void retirar(int retiro){
        if(this.saldo >= retiro) saldo =- retiro;
        else System.out.println("Saldo insuficiente");
    }
}
