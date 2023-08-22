public class Car {
    private String colour;
    private int speed;
    private String model;
    public Car(String colour, String model){ //Konstrukor heißt wie die Klasse und wird Großgeschrieben
        this.colour=colour;
        this.speed=0;
        this.model=model; // this verweist auf die Elemente der aktuellen Klasse
    }
    public void accelerlerate(int accelerate){
        speed += accelerate;
    }

    public String getColour (){
        return colour;
    } // Schnittstelle zu den Instanzvariable für außerhalb der Klasse
}
