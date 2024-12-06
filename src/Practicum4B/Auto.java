package Practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    // Constructor
    public Auto(String tp, double prPd) {
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    // Setter voor prijs per dag
    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }

    // Getter voor prijs per dag
    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    // toString methode
    @Override
    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}

