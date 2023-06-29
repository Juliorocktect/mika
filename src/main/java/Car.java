public class Car {
    private String colour;
    private int speed;
    private String model;
    public Car(String colour, String model){
        this.colour=colour;
        this.speed=0;
        this.model=model; // Konstruktor this verweist auf die Elemente der aktuellen Klasse
    }
    public void accelerlerate(int accelerate){
        speed += accelerate;
    }

    public String colour (){
        return colour;
    }

}
