import java.time.LocalDate;
import java.time.LocalTime;

public class Lectures extends Events implements LectureEvent {

    private String LecturerName;
    private String FacultyIntern;
    private String Course;
    private String Topic;

    // Constructor
    public Lectures(String eventName, String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer, String LecturerName, String Topic, String Course, String FacultyIntern) {
        super(eventName, eventType, eventLocation, eventDate, eventTime, duration, eventorganizer);
        this.LecturerName = LecturerName;
        this.FacultyIntern = FacultyIntern;
        this.Course = Course;
        this.Topic = Topic;
    }

    @Override
    public String getLName(){
        return LecturerName;
    }
    @Override
    public String getFI(){
        return FacultyIntern;
    }
    @Override
    public String getCourse(){
        return Course;
    }
    @Override
    public String getTopic(){
        return Topic;
    }

    @Override
    public void specificData(){
        System.out.println("Lecturer Name: " + LecturerName);
        System.out.println("Faculty Intern: " + FacultyIntern);
        System.out.println("Course: " + Course);
        System.out.println("Topic: " + Topic);
    }
    
}
