package modelo;

public class Animal {

    private int numPatas;
    private String nombre;

    public void showInfo() {
        System.out.printf("Soy un %s. Tengo %d patas%n", nombre, numPatas);
    }
    

    public Animal() {
    }

    
    public int getNumPatas() {
        return numPatas;
    }
  

    public String getNombre() {
        return nombre;
    }

  

  



   


}
