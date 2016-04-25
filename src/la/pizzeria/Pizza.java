package la.pizzeria;

public abstract class Pizza {

    private String masa;
    private String salsa;
    private String ingredientes;

    public Pizza(String masa, String salsa, String ingredientes) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
    }
    
    public void hacerPizza(){
        preparar();
        ornear();
        cortar();
        empacar();
    }
    
    public void preparar(){
        System.out.println("Estamos amasando la masa " + masa +"...");
        System.out.println("Estamos adicionando la salsa de " + salsa + "...");
        System.out.println("Estamos adicionando: " + ingredientes + "...");
    }
    
    public void ornear(){
        System.out.println("Estamos orneando tu pizza, esto tardará un momento...");
    }
    
    public void cortar(){
        System.out.println("Estamos cortando tu pizza, ya casi acabamos...");
    }
    
    public void empacar(){
        System.out.println("Tu pizza está siendo empacada, ya casi está lista...");
    }
    
}
