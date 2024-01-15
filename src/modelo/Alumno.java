package modelo;

public class Alumno extends Persona {

    private String curso;

    public Alumno(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }
    
}
