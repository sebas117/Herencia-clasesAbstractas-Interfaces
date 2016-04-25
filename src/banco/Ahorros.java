package banco;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ahorros extends Cuenta {

    private String fecha_de_vencimiento;     // DD/MM/AAAA
    private int interes;                     //en porcentaje mensual

    public Ahorros(String fecha_de_vencimiento, int interes, long no_de_cuenta, String nombre, int saldo) {
        super(no_de_cuenta, nombre, saldo);
        this.fecha_de_vencimiento = fecha_de_vencimiento;
        this.interes = interes;
    }
    
    public void depositar(){                 //unicamente el primer dia de cada mes
        Date d = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd");
        if ("01".equals(dateFormatter.format(d))) saldo += saldo * interes / 100;
        else System.out.println("No tienes permiso para depositar, solo los días primero de cada mes");
    }
    
    
    public void retirar(int retiro){        //solo se puede retirar el dia de la fecha de vencimiento
        if(saldo >= retiro){
            Date d = new Date();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
            if (fecha_de_vencimiento.equals(dateFormatter.format(d).toString().substring(0, 10))) saldo -= retiro;
            else System.out.println("No tienes permiso para retirar");
            System.out.println(saldo);
        } else System.out.println("Saldo insuficiente");
       
    }
    
    
    
}
