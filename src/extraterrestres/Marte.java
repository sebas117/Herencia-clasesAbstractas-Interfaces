/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraterrestres;

/**
 *
 * @author Juansebastian
 */
public class Marte extends Alienigena{

   
    public Marte(String color){
        
        super(color);
        
        color = "verde";
        numOjos= 4;
        vidas = 2;
        
    }

    public Marte(String color, int numOjos, int vidas) {
        super(color, numOjos, vidas);
    }

    @Override
    public String toString() {
        return "Marte{"+"color=" + color + ", numOjos=" + numOjos + ", vidas=" + vidas + '}';
    }
    
    
    
    

    
    
    
   
    
    
    
}
