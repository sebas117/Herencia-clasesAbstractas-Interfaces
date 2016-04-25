/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.pizzeria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emmanuel Vanegas
 */
public class LaPizzeria{

    /**
     * @param args the command line arguments
     */
    
    static Vegetariana v = new Vegetariana();
    static Peperoni p = new Peperoni();
    static Queso q = new Queso();
    
    public static void main(String[] args) {
        
        menu();
        
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a \"La pizzería\"");
        System.out.print("Presione(1) para ordenar una Pizza Vegetariana, (2) para una Pizza de Peperoni y (3) para una Pizza de Queso   ");
        switch(sc.nextInt()){
            case 1:     v.hacerPizza();     break;
            case 2:     p.hacerPizza();     break;
            case 3:     q.hacerPizza();     break;
        }
    }

}