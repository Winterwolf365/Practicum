import Practicum2B.Voetbalclub;
import org.junit.jupiter.api.Test;

public class TestVoetbalClub {
    @Test
    void IfClubNameIsNullShouldReturnFC() {
        Voetbalclub voetbalclub = new Voetbalclub("");
        assert voetbalclub.name().equals("FC");
    }

    @Test
    void IfWrongPointNoEffectOnCompetitionCount() {
        Voetbalclub voetbalclub = new Voetbalclub("");
        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('g');
        assert voetbalclub.aantalGespeeld() == 5;
    }

    @Test
    void IfPointCollectionWork() {
        Voetbalclub voetbalclub = new Voetbalclub("");
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('g');
        voetbalclub.verwerkResultaat('v');

        assert voetbalclub.toString().contains("3") && voetbalclub.toString().contains("1") && voetbalclub.toString().contains("0");
    }
}
