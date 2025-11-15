package Assignment2_Fida;
import java.time.LocalDate;
import java.time.LocalTime;

public class Parties extends Events implements PartyEvent {
    private String partyTheme;
    private String partyLocation;
    private String specialPerformer;
    private String dJName;
    private String dressCode;

    // Constructor
    public Parties(String eventName, String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer, String partyTheme, String PartyLocation, String SpecialPerfomer,String DJName, String DressCode) {
        super(eventName, eventType, eventLocation, eventDate, eventTime, duration, eventorganizer);
        this.partyTheme = partyTheme;
        this.partyLocation = PartyLocation;
        this.specialPerformer = SpecialPerfomer;
        this.dJName = DJName;
        this.dressCode = DressCode;
    }

    @Override
    public String getTheme() {
        return partyTheme;
    }
    @Override
    public String Location() {
        return partyLocation;
    }
    @Override
    public String getPerformer() {
        return specialPerformer;
    }
    @Override
    public String getDJ() {
        return dJName;
    }
    @Override
    public String getDressCode() {
        return dressCode;
    }


    
    @Override
    public void specificData() {
        System.out.println("Party Theme: " + partyTheme);
        System.out.println("Location: " + partyLocation);
        System.out.println("Perfomance By: " + specialPerformer);
        System.out.println("DJ: " + dJName );
        System.out.println("Dress Code: " + dressCode);
    }
    
}
