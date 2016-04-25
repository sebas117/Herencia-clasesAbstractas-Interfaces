/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraterrestres;

/**
 *
 * @author SebastianGil Y Emmanuel Vanegas
 * @version 1.0
 * @since 18/04/2016
 */

public class Main {
    
    /** Funcio permite la clase ejecutable
     * @param args the command line arguments
     */
    public static void main(String[]args){
        
        
        Alienigena A_marte = new Marte("Verde");
        Alienigena B_jupiter = new Jupiter("Rojo");
        
        System.out.println("Alienigenas..");
        System.out.println();
        
        System.out.println(A_marte);
        System.out.println(B_jupiter);
        
        
        
    }
    
    
    
}
