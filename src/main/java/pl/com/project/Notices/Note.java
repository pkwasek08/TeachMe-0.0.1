package pl.com.project.Notices;

import javax.persistence.*;

import java.util.Date;

@Entity
public class Note {

    @Id
    @GeneratedValue
    private Long id;
    private String meeting_place;
    private StringBuffer note = new StringBuffer(500);

    public Note(String meeting_place, StringBuffer note) {
        this.meeting_place = meeting_place;
        this.note = note;
    }

    public Note() {
    }

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

    public StringBuffer getNote() {
        return note;
    }

    public void setNote(StringBuffer note) {
        this.note = note;
    }
}
