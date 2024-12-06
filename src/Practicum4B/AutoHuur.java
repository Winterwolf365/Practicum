package Practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    // Constructor
    public AutoHuur() {
        this.aantalDagen = 0;
        this.gehuurdeAuto = null;
        this.huurder = null;
    }

    // Setter voor aantal dagen
    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    // Getter voor aantal dagen
    public int getAantalDagen() {
        return aantalDagen;
    }

    // Setter voor gehuurde auto
    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    // Getter voor gehuurde auto
    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    // Setter voor huurder
    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    // Getter voor huurder
    public Klant getHuurder() {
        return huurder;
    }

    // Methode om de totale prijs te berekenen
    public double totaalPrijs() {
        if (gehuurdeAuto == null || huurder == null) {
            return 0.0;
        }
        double prijsZonderKorting = gehuurdeAuto.getPrijsPerDag() * aantalDagen;
        double korting = (huurder.getKorting() / 100) * prijsZonderKorting;
        return prijsZonderKorting - korting;
    }

    // toString methode
    @Override
    public String toString() {
        String autoInfo = (gehuurdeAuto != null) ? gehuurdeAuto.toString() : "er is geen auto bekend";
        String klantInfo = (huurder != null) ? huurder.toString() : "er is geen huurder bekend";
        return "  autotype: " +  autoInfo + "\n" + "  op naam van: " + klantInfo + "\n" + "  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }
}
