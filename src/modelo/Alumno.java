package modelo;


public class Alumno extends Persona {

    private String curso;
    private int calificacion;

    public Alumno(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    @Override
    public void saltar(int altura) {
        System.out.println(altura);
    }
    
}
