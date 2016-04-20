package agen_autos;

public class Camioneta extends Carro {
    
    private int carga;                  //kg
    private int rodadas;                
    private int ejes;
        
    public Camioneta(int nsm, String marca, int año, long precio, int carga, int rodadas, int ejes) {
        super(nsm, marca, año, precio);
        this.carga = carga;
        this.rodadas = rodadas;
        this.ejes = ejes;
    }
    
    public String toString(){
       
        return String.format("Numero de serie: %s\nMarca: %s\nAño: %s\nPrecio: %s\n"
                 + "Carga(kg): %s\nRodadas: %s\nEjes: %s\n", nsm, marca, año, precio, carga,rodadas,ejes);
        
     }

}
