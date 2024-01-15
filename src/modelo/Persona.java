package modelo;


public abstract class Persona{

    private String nombre;
    private int edad;
   
    public Persona(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String value){
        this.nombre = value;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int value){
        this.edad = value;
    }

    public void escribirNombre(){
        System.out.println(this.nombre);
    }

    public abstract void saltar(int altura);
}
