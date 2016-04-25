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
public class Alienigena {
    
    protected String color;
    protected int numOjos;
    protected int vidas;

    public Alienigena(String color){
        
        this.color = color;
        numOjos= 0;
        vidas = 0;
        
        
    }
    
    
    public Alienigena(String color, int numOjos, int vidas) {
        this.color = color;
        this.numOjos = numOjos;
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Alienigena{" + "color=" + color + ", numOjos=" + numOjos + ", vidas=" + vidas + '}';
    }
    
    
    
}
