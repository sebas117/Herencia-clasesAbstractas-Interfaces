package colegio;

public class Empleado extends Persona {

    private String jefe;

    public Empleado(String jefe, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.jefe = jefe;
    }
    
    public void combrar(){
        
        
    }
    
}
