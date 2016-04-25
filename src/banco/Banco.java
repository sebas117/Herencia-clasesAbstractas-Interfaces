package banco;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SebastianGil Y Emmanuel Vanegas
 * @version 1.0
 * @since 17/04/2016
 */
public class Banco {
    
    
    /**
     * Funcio permite la clase ejecutable
     * @param args the command line arguments
     */
    
    static Scanner sc = new Scanner(System.in);
    
    private static void menu(Ahorros a) {        
        System.out.println("Presione (1) para consultar los datos de la cuenta");
        System.out.println("Presione (2) para depositar a su cuenta");
        System.out.print("Presione (3) para retirar de su cuenta");
        switch (sc.nextInt()) {
            case 1:
                a.consultarDatos();
                break;
            case 2:
                System.out.println("Digite la cantidad de dinero que desea retirar");
                a.depositar(sc.nextInt());
                break;
            case 3:
                System.out.println("Digite la cantidad de dinero que desea retirar");
                a.retirar(sc.nextInt());
                break;
        }
    }
    
    private static void menu(Cheque a) {        
        System.out.println("\tPresione (1) para consultar los datos de la cuenta");
        System.out.println("\tPresione (2) para depositar a su cuenta");
        System.out.print("\tPresione (3) para retirar de su cuenta");
        switch (sc.nextInt()) {
            case 1:
                a.consultarDatos();
                break;
            case 2:
                System.out.println("Digite la cantidad de dinero que desea retirar");
                a.depositar(sc.nextInt());
                break;
            case 3:
                System.out.println("Digite la cantidad de dinero que desea retirar");
                a.retirar(sc.nextInt());
                break;
        }
    }
    
    public static void main(String[] args) {
        
        Ahorros[] ahorros = new Ahorros[5];
        Cheque[] cheque = new Cheque[2];
        
        ahorros[0] = new Ahorros("28/06/2016", 1, 98061452800L, "Emmanuel", 100000);
        ahorros[1] = new Ahorros("12/04/2017", 3, 91834959177L, "Eric", 200000);
        ahorros[2] = new Ahorros("04/10/2016", 2, 48118571984L, "Andrés", 150000);
        ahorros[3] = new Ahorros("14/02/2017", 3, 47389195581L, "Sebastian", 80000);
        ahorros[4] = new Ahorros("13/12/2016", 2, 84885404099L, "Sandra", 55000);
        
        cheque[0] = new Cheque(3, 10000, 32327123491L, "Roberto", 1300000);
        cheque[1] = new Cheque(2, 10000, 73850001475L, "Diana", 275000);
        
        while(true){
            System.out.print("Cuenta de ahorros (1) o cheque (2)?   ");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.print("Digite el numero de la cuenta:        ");
                long b = sc.nextLong();
                for (int i = 0; i < 5; i++) {
                    if (ahorros[i].getNo_de_cuenta() == b){
                        menu(ahorros[i]);
                    }
                }
            } else if(a == 2){
                System.out.print("Digite el numero de la cuenta:        ");
                long b = sc.nextLong();
                for (int i = 0; i < 2; i++) {
                    if (cheque[i].getNo_de_cuenta() == b) {
                        menu(cheque[i]);
                    }
                }
            }
        }
    }
}
//cambiar int por long