package pl.com.project.Notices;

import javax.persistence.*;

import java.util.Date;

@Entity
public class Notice {

    @Id
    @GeneratedValue
    private Long id;


    private char look_or_offer;
    private Date meeting_date;
    private String meeting_place;
    private StringBuffer note;
    private Long user_id_user;

    public Notice(char look_or_offer, Date meeting_date, String meeting_place, StringBuffer note, Long user_id_user) {
        this.look_or_offer = look_or_offer;
        this.meeting_date = meeting_date;
        this.meeting_place = meeting_place;
        this.note = note;
        this.user_id_user = user_id_user;
    }

    public Notice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getLook_or_offer() {
        return look_or_offer;
    }

    public void setLook_or_offer(char look_or_offer) {
        this.look_or_offer = look_or_offer;
    }

    public Date getMeeting_date() {
        return meeting_date;
    }

    public void setMeeting_date(Date meeting_date) {
        this.meeting_date = meeting_date;
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

    public Long getUser_id_user() {
        return user_id_user;
    }

    public void setUser_id_user(Long user_id_user) {
        this.user_id_user = user_id_user;
    }
}
