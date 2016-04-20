package colegio;

public class Estudiante extends Persona {
    
    private int grado;
    private char grupo;

    public Estudiante(int grado, char grupo, String nombre, String domicilio, String horario) {
        super(nombre, domicilio, horario);
        this.grado = grado;
        this.grupo = grupo;
    }

    public void estudiar(){
        
    }

}
