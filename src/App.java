import modelo.*;

public class App {

    String mensaje;
    public static void main(String[] args) throws Exception {


        Persona persona1 = new Persona("Antonio", 25);
        persona1.setEdad(25);
        persona1.setNombre("Antonio");

        String nombrePersona = persona1.getNombre();
        persona1.escribirNombre();;


        Alumno alumno1 = new Alumno("Maria", 20, "Primero");
        alumno1.escribirNombre();

        System.out.println("Hello, World!");

        int valor1 = 0;
        int valor2 = 10;
        String mensaje;

        if (valor1<valor2){
             mensaje = "mensaje";
            for (int contador= valor1; contador<valor2; contador++){
                System.out.println(contador);
            }
        }
        else{
             mensaje = "otro mensaje";
            for (int contador = valor2; contador>valor1; contador--){
                System.out.println(contador);
            }
        }

        int c = valor1;
        while (c<valor2){
            System.out.println(c);
            c++;
        }

        String cadena1 = "hola";
        String cadena2 = "hola";

        if (cadena1.equals(cadena2)){
            cadena1 = "adios";
            System.out.println("cadenas iguales");
        }
        else{
            System.out.println("cadenas distintas");
        }

        switch (cadena2) {
            case "hola":
                System.out.println("hola");
                break;
            case "adios":
                System.out.println("Adios");
                break;
            default:
                System.out.println("Otra opción");
                break;
        }


        for (int contador = 0; contador<10; contador=contador+2){
            System.out.println(contador);
        }


        System.out.println("Ejecución WHILE");
        int i = 10000;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Ejecución DO-WHILE");
        i = 1000; 
        do {
            System.out.println(i);
            i++;
        } while (i<10);

    }
 
    private int sumar(int op1, int op2){
        mensaje = "más";
        return op1 + op2;
    }
}
