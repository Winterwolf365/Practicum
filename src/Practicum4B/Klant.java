package Practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    // Constructor
    public Klant(String nm) {
        this.naam = nm;
        this.kortingsPercentage = 0.0;
    }

    // Setter voor korting
    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    // Getter voor korting
    public double getKorting() {
        return kortingsPercentage;
    }

    // toString methode
    @Override
    public String toString() {
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
