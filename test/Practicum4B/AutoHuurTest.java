package Practicum4B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoHuurTest {

    @Test
    public void testGeenHuurderGeenAuto() {
        AutoHuur ah = new AutoHuur();
        assertEquals(0.0, ah.totaalPrijs(), "Totaalprijs moet 0.0 zijn als er geen huurder en geen auto is ingesteld");
        assertEquals("  autotype: er is geen auto bekend\n  op naam van: er is geen huurder bekend\n  aantal dagen: 0 en dat kost 0.0", ah.toString());
    }

    @Test
    public void testGeenHuurderWelAuto() {
        AutoHuur ah = new AutoHuur();
        Auto auto = new Auto("Volkswagen Golf", 40.0);
        ah.setGehuurdeAuto(auto);
        ah.setAantalDagen(5);
        assertEquals(0.0, ah.totaalPrijs(), "Totaalprijs moet gelijk zijn aan 40 * 5");
        assertTrue(ah.toString().contains("Volkswagen Golf"), "De auto moet in de toString-output voorkomen");
    }

    @Test
    public void testWelHuurderGeenAuto() {
        AutoHuur ah = new AutoHuur();
        Klant klant = new Klant("Jan Jansen");
        klant.setKorting(15.0);
        ah.setHuurder(klant);
        ah.setAantalDagen(3);
        assertEquals(0.0, ah.totaalPrijs(), "Totaalprijs moet 0.0 zijn als er geen auto is ingesteld");
        assertTrue(ah.toString().contains("Jan Jansen"), "De klant moet in de toString-output voorkomen");
    }

    @Test
    public void testHuurderZonderKortingMetAuto() {
        AutoHuur ah = new AutoHuur();
        Klant klant = new Klant("Piet Pietersen");
        ah.setHuurder(klant);
        Auto auto = new Auto("Toyota Corolla", 30.0);
        ah.setGehuurdeAuto(auto);
        ah.setAantalDagen(4);
        assertEquals(120.0, ah.totaalPrijs(), "Totaalprijs moet gelijk zijn aan 30 * 4");
    }

    @Test
    public void testHuurderMetKortingMetAuto() {
        AutoHuur ah = new AutoHuur();
        Klant klant = new Klant("Klaas Klaassen");
        klant.setKorting(20.0); // 20% korting
        ah.setHuurder(klant);
        Auto auto = new Auto("Audi A4", 50.0);
        ah.setGehuurdeAuto(auto);
        ah.setAantalDagen(2);
        assertEquals(80.0, ah.totaalPrijs(), "Totaalprijs moet gelijk zijn aan (50 * 2) * (1 - 0.20)");
    }

    @Test
    public void testAantalDagenIsNul() {
        AutoHuur ah = new AutoHuur();
        ah.setGehuurdeAuto(new Auto("BMW X5", 100.0));
        ah.setHuurder(new Klant("Johan Bos"));
        ah.setAantalDagen(0);
        assertEquals(0.0, ah.totaalPrijs(), "Totaalprijs moet 0.0 zijn als aantal dagen 0 is");
    }

    @Test
    public void testAutoPrijsPerDagNul() {
        AutoHuur ah = new AutoHuur();
        Auto auto = new Auto("Fiat Panda", 0.0);
        ah.setGehuurdeAuto(auto);
        ah.setAantalDagen(10);
        ah.setHuurder(new Klant("Lies van Dijk"));
        assertEquals(0.0, ah.totaalPrijs(), "Totaalprijs moet 0.0 zijn als de prijs per dag 0.0 is");
    }

    @Test
    public void testHuurderMet100ProcentKorting() {
        AutoHuur ah = new AutoHuur();
        Klant klant = new Klant("100% Discount");
        klant.setKorting(100.0); // 100% korting
        ah.setHuurder(klant);
        Auto auto = new Auto("Mercedes E-Class", 150.0);
        ah.setGehuurdeAuto(auto);
        ah.setAantalDagen(3);
        assertEquals(0.0, ah.totaalPrijs(), "Totaalprijs moet 0.0 zijn als huurder 100% korting heeft");
    }

    @Test
    public void testGeenDagenIngesteld() {
        AutoHuur ah = new AutoHuur();
        ah.setGehuurdeAuto(new Auto("Tesla Model S", 120.0));
        ah.setHuurder(new Klant("Elon Musk"));
        assertEquals(0.0, ah.totaalPrijs(), "Totaalprijs moet 0.0 zijn als het aantal dagen niet expliciet is ingesteld");
    }
}
