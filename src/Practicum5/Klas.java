package Practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;

    // Constructor
    public Klas(String kC) {
        this.klasCode = kC;
        this.deLeerlingen = new ArrayList<>();
    }

    // Methode om een leerling toe te voegen
    public void voegLeerlingToe(Leerling l) {
        deLeerlingen.add(l);
    }

    // Methode om het cijfer van een leerling te wijzigen
    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling leerling : deLeerlingen) {
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(nweCijfer);
                return;
            }
        }
    }

    // Getter voor de lijst van leerlingen
    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    // Methode om het aantal leerlingen te tellen
    public int aantalLeerlingen() {
        return deLeerlingen.size();
    }

    // toString methode
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("In klas " + klasCode + " zitten de volgende leerlingen:\n");
        for (Leerling leerling : deLeerlingen) {
            sb.append(leerling.toString()).append("\n");
        }
        return sb.toString();
    }
}
