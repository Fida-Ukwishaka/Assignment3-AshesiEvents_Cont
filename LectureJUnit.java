import org.junit.jupiter.api.Test;
import Assignment2_Fida.Lectures;
import org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class LectureJUnit {
    @Test
    public void ltest(){
        Lectures first = new Lectures(
            "CLASS COURSE: Object-Oriented Programming",
            "Lecture",
            "Nana Araba APT Hall 217",
            LocalDate.of(2024, 6, 20),
            LocalTime.of(9, 45),
            2,
            "Computer Science Department",
            "Dr. Ebo",
            "Abstraction and Inheritance",
            "Object-Oriented Programming",
            "Blaise Izerimana"
        );
        Lectures second = new Lectures("CLASS COURSE: Data Structures",
            "Lecture",
            "Nana Araba APT Hall 216",
            LocalDate.of(2025, 6, 21),
            LocalTime.of(11, 30),
            2,
            "Computer Science Department",
            "Dr. Daniel Addo",
            "Trees and Graphs",
            "Algorithms and Data Structures",
            "Sarah Mensah");

        assertEquals("Dr.Agnes",second.getLName());
        assertEquals("Anatomy",first.getCourse());
        assertEquals("Fida U.",first.getFI());
        assertEquals("Muscles of the Skin",second.getTopic());

        first.specificData();
        second.specificData();
    }
}
