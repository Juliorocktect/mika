public class Mika { // eine Klasse

    private int age;
    // private heißt dass, dass nur innerhalb dieser Klasse auf diesen wert zugegriffen werden,
    // kann ohne Schnittstelle
    private String name;
    public Mika(){} //ein Konstruktor setzt die Attribute eines Objektes einem Wert

    public String getName(){return name;}
    //get Methode
    // die Schnittstelle
    private void setName(String name){this.name = name;}
    // void heißt, dass die Methode keinen Rückgabewert hat
    //mit this wird auf das Aktuelle Objekt der Klasse gezeigt
}
