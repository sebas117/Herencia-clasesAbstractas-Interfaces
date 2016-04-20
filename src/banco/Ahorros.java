package banco;

import java.util.Date;

public class Ahorros extends Cuenta {

    private Date fecha_de_vencimiento;
    private Date fecha_actual;
    private int interes;                     //en porcentaje mensual

    public Ahorros(int no_de_cuenta, String nombre_cliente, int saldo, int dia, int mes,
            int año) {
        super(no_de_cuenta, nombre_cliente, saldo);

        this.interes = interes;
        fecha_de_vencimiento = new Date();
        fecha_actual = new Date();

        fecha_de_vencimiento.setDate(dia);
        fecha_de_vencimiento.setMonth(mes);
        fecha_de_vencimiento.setYear(mes);

        ;
    }

    public void depositar_intereses() {//unicamente el primer dia de cada mes

        if (fecha_actual.getDate() == 1) {
            saldo = +saldo * interes / 100;
        } else {
            System.out.println("No es el primer dia del mes");
        }
    }

    @Override
    public void retirar(int retiro) //Solamente la fecha de vencimiento
    {
        if (fecha_actual.getDate() == fecha_de_vencimiento.getDate()) {
           
            super.retirar(retiro);

        }
    }

   
    

}
