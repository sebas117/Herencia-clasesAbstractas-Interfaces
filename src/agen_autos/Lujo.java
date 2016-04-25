package agen_autos;

public class Lujo extends Carro {
    
    private int pasajeros;
    
    public Lujo(int nsm, String marca, int año, long precio, int pasajeros) {
        super(nsm, marca, año, precio);
        this.pasajeros = pasajeros;
    }

    
    public String toString(){
       return String.format("Numero de serie: %s \nMarca: %s \nAño: %s \nPrecio: %s \n"
                 + "Pasajeros: %s", nsm, marca, año, precio, pasajeros);
     }
    
    
    
}
