package Assignment2_Fida;
import java.time.LocalDate;
import java.time.LocalTime;

public class Sports extends Events {
    private String sportType;
    private String hostAssociation;
    private String gameSeason;
    private String team1;
    private String team2;
    

    // Constructor
    public Sports(String eventName, String eventType, String eventLocation, LocalDate eventDate, LocalTime eventTime, int duration, String eventorganizer, String sportType, String hostAssociation, String gameSeason, String team1,String team2) {
        super(eventName, eventType, eventLocation, eventDate, eventTime, duration, eventorganizer);
        this.sportType = sportType;
        this.team1 = team1;
        this.team2 = team2;
        this.hostAssociation = hostAssociation;
        this.gameSeason = gameSeason;

    }

    @Override
    public String getType() {
        return sportType;
    }
    @Override
    public String getAssociation() {
        return hostAssociation;
    }
    @Override
    public String getGameSeason() {
        return gameSeason;
    }
    @Override
    public String getTeam1() {
        return team1;
    }
    @Override
    public String getTeam2(){
        return team2;
    }

    @Override
    public void specificData() {
        System.out.println("Sport Type: " + sportType);
        System.out.println("Hosted by: " + hostAssociation);
        System.out.println("Season " + gameSeason);
        System.out.println("Teams Involved: " + teams);
    }
    
}
