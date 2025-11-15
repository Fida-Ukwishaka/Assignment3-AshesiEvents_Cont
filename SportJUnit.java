import org.junit.jupiter.api.Test;

import Assignment2_Fida.Parties;
import Assignment2_Fida.Sports;
import org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.time.LocalDate;
import java.time.LocalTime;


public class SportJUnit {
    @Test
    public void sTest(){
        Sports s1 = new Sports("Varsity League",
        "Sports",
        "Ashesi New Basketaball Court",
        LocalDate.of(2025, 11, 18),
        LocalTime.of(17, 0),
        5,
        "Sports Committee",
        "Basketball",
        "Ashesi Basketball Association",
        2025,
        "Ashesi University vs. Academic City University");

        Sports s2 = new Sports("Interclasses Tournaments",
            "Sports",
            "Ashesi Football Field",
            LocalDate.of(2025, 12, 20),
            LocalTime.of(19, 0),
            3,
            "Ashesi Students Council",
            "Football, Volleyball, and Basketball",
            "Ashesi Football Association, Ashesi Volleyball Association, and Ashesi Basketball Association",
            2025,
            "Class of 2026&2029 vs. Class of 2027&2028"
        );

        // Create Party objects
        Parties party1 = new Parties(
            "Pary With Mavo",
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


        assertEquals("Football", s1.getType());
        assertEquals("Ashesi Volleyball Association",s1.getAssociation());
        assertEquals("Regular", s2.getGameSeason());
        assertEquals("Team Blaise", s1.getTeam1());
        assertEquals("Team Lyse", s2.getTeam2());


        // Test specificData output
        s1.specificData();
        s2.specificData();
        
    }
}
