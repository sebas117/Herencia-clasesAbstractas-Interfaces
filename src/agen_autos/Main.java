/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agen_autos;

/**
 *
 * @author SebastianGil Y Emmanuel Vanegas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("AGENCIA DE AUTOS");
        System.out.println();
        
        System.out.println("Autos");
        System.out.println("Auto de lujo: ");
        Carro lujo = new Lujo (456394, "Mercedes_Benz", 2014, 84000000, 1);
        System.out.println(lujo);
        
        System.out.println();
        
        System.out.println("Auto Compacto: ");
        Carro comp = new Compacto (123, "Peugeot", 2010, 26000000, 4);
        System.out.println(comp);
        
        System.out.println();
        
        System.out.println("Vagoneta");
        Carro vag = new Vagoneta (0342, "Toyota", 2014, 64000000, 4);
        System.out.println(vag);
        
        System.out.println();
        
        System.out.println("Camioneta");
        Carro cam = new Camioneta (86001, "Ford", 2014, 81000000, 80, 2, 4);
        System.out.println(cam);
        
        
        
        
    }
    
}
