package Practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    // Constructor
    public Leerling(String nm) {
        this.naam = nm;
        this.cijfer = 0.0;
    }

    // Getter voor naam
    public String getNaam() {
        return naam;
    }

    // Getter voor cijfer
    public double getCijfer() {
        return cijfer;
    }

    // Setter voor cijfer
    public void setCijfer(double c) {
        this.cijfer = c;
    }

    // toString methode
    @Override
    public String toString() {
        return naam + " heeft cijfer: " + cijfer;
    }
}
