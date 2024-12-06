package Practicum4A;

public class Persoon {
    private String naam;
    private int leeftijd;

    // Constructor
    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    // Getter voor naam
    public String getNaam() {
        return naam;
    }

    // Getter voor leeftijd
    public int getLeeftijd() {
        return leeftijd;
    }

    // toString methode
    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}

