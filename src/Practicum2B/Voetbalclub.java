package Practicum2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    // Constructor
    public Voetbalclub(String naam) {
        this.naam = naam.trim(); // Trim om overbodige spaties te verwijderen
        if (this.naam.isEmpty()) {
            this.naam = "FC";
        }

        this.aantalGewonnen = 0;
        this.aantalGelijk = 0;
        this.aantalVerloren = 0;
    }

    // Methode om een resultaat te verwerken
    public void verwerkResultaat(char resultaat) {
        switch (resultaat) {
            case 'w': // gewonnen
                aantalGewonnen++;
                break;
            case 'g': // gelijkspel
                aantalGelijk++;
                break;
            case 'v': // verloren
                aantalVerloren++;
                break;
            default:
                System.out.println("Ongeldig resultaat: " + resultaat);
        }
    }

    public String name() {
        return naam;
    }

    // Methode om totaal aantal punten te berekenen
    public int aantalPunten() {
        return (aantalGewonnen * 3) + (aantalGelijk);
    }

    // Methode om totaal aantal gespeelde wedstrijden te berekenen
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    // toString methode
    @Override
    public String toString() {
        return naam + "\t" +
                aantalGespeeld() + " " +
                aantalGewonnen + " " +
                aantalGelijk + " " +
                aantalVerloren + " " +
                aantalPunten() + " ";
    }
}

