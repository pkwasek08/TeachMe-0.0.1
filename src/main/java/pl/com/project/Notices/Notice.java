package pl.com.project.Notices;

import javax.persistence.*;

import java.util.Date;

@Entity
public class Notice {

    @Id
    @GeneratedValue
    private Long id;

    private String meeting_place;

    public Notice(String meeting_place) {
        this.meeting_place = meeting_place;
    }
    public Notice() {};


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeeting_place() {
        return meeting_place;
    }

    public void setMeeting_place(String meeting_place) {
        this.meeting_place = meeting_place;
    }
}
