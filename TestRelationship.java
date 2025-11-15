import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

public  class TestRelationship{
    @Test
    public void TestLectureRelationship(){
        Lectures lecture = new Lectures(
            "CLASS COURSE: Data Structures",
            "Lecture",
            "Nana Araba APT Hall 216",
            LocalDate.of(2025, 6, 21),
            LocalTime.of(11, 30),
            2,
            "Computer Science Department",
            "Dr. Daniel Addo",
            "Trees and Graphs",
            "Algorithms and Data Structures",
            "Sarah Mensah"
        );

        assertTrue(lecture instanceof LectureEvent);
    }
    
    @Test
    public void TestPartyRelationship(){
        Parties party = new Parties(
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
            "Party casual"
        );
        assertTrue(party instanceof PartyEvent);
    }

    @Test
    public void TestSportsRelationship(){
        Sports match = new Sports(
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
        assertTrue(match instanceof SportEvent);
    }
}