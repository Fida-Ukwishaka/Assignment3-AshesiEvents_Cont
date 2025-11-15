import org.junit.jupiter.api.Test;
import Assignment2_Fida.Parties;
import org.junit.jupiter.api.Assertions.*;

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
            
        Parties p2 = new Parties("Ubora",
            "Awards Evening",
            "Alisa Hotel Accra",
            LocalDate.of(2025, 12, 3),
            LocalTime.of(17, 0),
            5,
            "Ashesi University",
            "Celebrating Excellence",
            "Grand Ballroom",
            "Live Performance by Tyler",
            "DJ Remy",
            "Elegance");

        assertEquals("Neon", p1.getTheme());
        assertEquals("The Hive", p1.Location());
        assertEquals("DJ Mike", p1.getDJ());
        assertEquals("Masquerade", p2.getDressCode());
        
        p1.specificData();
        p2.specificData();
    }
}
