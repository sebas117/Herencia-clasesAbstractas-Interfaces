package colegio;

public class Administrador extends Empleado {
    
    private String puesto;

    public Administrador(String puesto, String jefe, String nombre, String domicilio, String horario) {
        super(jefe, nombre, domicilio, horario);
        this.puesto = puesto;
    }
    
    public void administrar(){
        
    }

}
