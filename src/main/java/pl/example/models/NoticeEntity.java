package pl.example.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "notice", schema = "public", catalog = "d2b6rsc8m7io0b")
public class NoticeEntity {
    private int idNotice;
    private Character lookOrOffer;
    private String note;
    private String meetingPlace;
    private Date meetingDate;
    private Double price;
    private Character active;
    private Double timeFrom;
    private Double timeTo;

    @Id
    @Column(name = "id_notice", nullable = false)
    public int getIdNotice() {
        return idNotice;
    }

    public void setIdNotice(int idNotice) {
        this.idNotice = idNotice;
    }

    @Basic
    @Column(name = "look_or_offer", nullable = false, length = -1)
    public Character getLookOrOffer() {
        return lookOrOffer;
    }

    public void setLookOrOffer(Character lookOrOffer) {
        this.lookOrOffer = lookOrOffer;
    }

    @Basic
    @Column(name = "note", nullable = true, length = -1)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "meeting_place", nullable = false, length = 127)
    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    @Basic
    @Column(name = "meeting_date", nullable = false)
    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "active", nullable = false, length = -1)
    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    @Basic
    @Column(name = "time_from", nullable = true, precision = 0)
    public Double getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Double timeFrom) {
        this.timeFrom = timeFrom;
    }

    @Basic
    @Column(name = "time_to", nullable = true, precision = 0)
    public Double getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(Double timeTo) {
        this.timeTo = timeTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeEntity that = (NoticeEntity) o;

        if (idNotice != that.idNotice) return false;
        if (lookOrOffer != null ? !lookOrOffer.equals(that.lookOrOffer) : that.lookOrOffer != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (meetingPlace != null ? !meetingPlace.equals(that.meetingPlace) : that.meetingPlace != null) return false;
        if (meetingDate != null ? !meetingDate.equals(that.meetingDate) : that.meetingDate != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (timeFrom != null ? !timeFrom.equals(that.timeFrom) : that.timeFrom != null) return false;
        if (timeTo != null ? !timeTo.equals(that.timeTo) : that.timeTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idNotice;
        result = 31 * result + (lookOrOffer != null ? lookOrOffer.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (meetingPlace != null ? meetingPlace.hashCode() : 0);
        result = 31 * result + (meetingDate != null ? meetingDate.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (timeFrom != null ? timeFrom.hashCode() : 0);
        result = 31 * result + (timeTo != null ? timeTo.hashCode() : 0);
        return result;
    }
}
