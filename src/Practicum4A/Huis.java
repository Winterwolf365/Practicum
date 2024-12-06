package Practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    // Constructor
    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    // Getter voor adres
    public String getAdres() {
        return adres;
    }

    // Getter voor bouwjaar
    public int getBouwjaar() {
        return bouwjaar;
    }

    // Getter voor huisbaas
    public Persoon getHuisbaas() {
        return huisbaas;
    }

    // Setter voor huisbaas
    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    // toString methode
    @Override
    public String toString() {
        return "Huis " + adres + ", is gebouwd in " + bouwjaar + ", \nen heeft de huisbaas " + huisbaas;
    }
}
