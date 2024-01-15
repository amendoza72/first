package animales;

public class Perro implements Animal{
    private int energia;

    @Override
    public void comer(int cantidad) {
        energia = energia + (2*cantidad);
    }
    
}
