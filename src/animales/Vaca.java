package animales;

public class Vaca implements Animal{

    private int energia;
    @Override
    public void comer(int cantidad) {
        energia = energia + cantidad;
    }
    
}
