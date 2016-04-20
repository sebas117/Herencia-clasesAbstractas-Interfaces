package colegio;

public class Profesor extends Empleado {
    
    private String carrera;

    public Profesor(String carrera, String jefe, String nombre, String domicilio, String horario) {
        super(jefe, nombre, domicilio, horario);
        this.carrera = carrera;
    }
    
    public void enseñar(){
        
    }

}
