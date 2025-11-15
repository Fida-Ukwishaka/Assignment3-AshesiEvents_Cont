import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;
import java.time.LocalDate;
import java.time.LocalTime;


public class SportJUnit {
    @Test
    public void sTest(){
        Sports s1 = new Sports(
        "Varsity League",
        "Sports",
        "Ashesi New Basketaball Court",
        LocalDate.of(2025, 11, 18),
        LocalTime.of(17, 0),
        5,
        "Sports Committee",
        "Basketball",
        "Ashesi Basketball Association",
        "2025",
        "Ashesi University",
        " Academic City University"
        );


        assertEquals("Basketball", s1.getType());
        assertEquals("Ashesi Basketball Association",s1.getAssociation());
        assertEquals("Ashesi University", s1.getTeam1());


        // Test specificData output
        s1.specificData();
        
    }
}
