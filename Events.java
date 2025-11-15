package Assignment2_Fida;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Events {

    private String eventName;
    private String eventType; 
    private String eventLocation;
    private LocalDate eventDate;
    private LocalTime eventTime;
    private int Duration;// in hours
    private String eventorganizer;

    // Constructor
    public Events(String eventName,String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.Duration = duration;
        this.eventorganizer = eventorganizer;
    }

    // getter methods
    public String getEventName() {
        return eventName;
    }
    public String getEventType() {
        return eventType;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public LocalDate getEventDate() {
        return eventDate;
    }
    public LocalTime getEventTime() {
        return eventTime;
    }
    public int getDuration() {
        return Duration;
    }
    public String getEventorganizer() {
        return eventorganizer;
    }

    public abstract void specificData();


    // event summary method
    public void eventSummary() {
        System.out.println( "Event Name: " + eventName);
        System.out.println("Event Type: " + eventType);
        System.out.println("Organizer: " + eventorganizer);
        System.out.println("Location: " + eventLocation);
        System.out.println("Date: " + eventDate);
        System.out.println("Time: " + eventTime);
        System.out.println("Duration: " + Duration + " hours");
        specificData();
    }

}


    






   
