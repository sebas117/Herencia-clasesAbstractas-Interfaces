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
public class Jupiter extends Alienigena {
    
    
    
    public Jupiter(String color){
        
        super(color);
        color = "rojo";
        numOjos=  2;
        vidas = 8;
                        
    }
   
    
    public Jupiter(String color, int numOjos, int vidas) {
        super(color, numOjos, vidas);
     
    }

    @Override
    public String toString() {
        return "Jupiter{" + "color=" + color + ", numOjos=" + numOjos + ", vidas=" + vidas +'}';
    }

    
    
    
    
}
