import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class PartyJUnit {
    @Test
    public void PTest(){
      Parties p1 = new Parties("Pary With Mavo",
            "Party",
            "Ashesi Campus",
            LocalDate.of(2025, 11, 29),
            LocalTime.of(20, 0),
            10,
            "Ashesi Sports Comittee",
            "Till Morning",
            "New Car Park",
            "Mavo",
            "DJ Phize",
            "Party casual");

        assertEquals("Till Morning", p1.getTheme());
        assertEquals("New Car Park", p1.getPartyLocation());
        assertEquals("DJ Phize", p1.getDJ());
        
        p1.specificData();
    }
}
