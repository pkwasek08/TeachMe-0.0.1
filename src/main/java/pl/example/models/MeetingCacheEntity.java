package pl.example.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "meeting_cache", schema = "public", catalog = "d2b6rsc8m7io0b")
public class MeetingCacheEntity {
    private int idUserCache;
    private String meetingPlace;
    private MeetingEntity meetingByMeetingIdMeeting;
    private Integer userIdUser;
    private int meetingIdMeeting;
    private Collection<MeetingEntity> meetingsByIdUserCache;
    private UserEntity userByUserIdUser;

    @Id
    @Column(name = "id_user_cache", nullable = false)
    public int getIdUserCache() {
        return idUserCache;
    }

    public void setIdUserCache(int idUserCache) {
        this.idUserCache = idUserCache;
    }

    @Basic
    @Column(name = "meeting_place", nullable = false, length = 127)
    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeetingCacheEntity that = (MeetingCacheEntity) o;

        if (idUserCache != that.idUserCache) return false;
        if (meetingPlace != null ? !meetingPlace.equals(that.meetingPlace) : that.meetingPlace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUserCache;
        result = 31 * result + (meetingPlace != null ? meetingPlace.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "meeting_id_meeting", referencedColumnName = "id_meeting", nullable = false)
    public MeetingEntity getMeetingByMeetingIdMeeting() {
        return meetingByMeetingIdMeeting;
    }

    public void setMeetingByMeetingIdMeeting(MeetingEntity meetingByMeetingIdMeeting) {
        this.meetingByMeetingIdMeeting = meetingByMeetingIdMeeting;
    }

    @Basic
    @Column(name = "user_id_user", nullable = true)
    public Integer getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(Integer userIdUser) {
        this.userIdUser = userIdUser;
    }

    @Basic
    @Column(name = "meeting_id_meeting", nullable = false)
    public int getMeetingIdMeeting() {
        return meetingIdMeeting;
    }

    public void setMeetingIdMeeting(int meetingIdMeeting) {
        this.meetingIdMeeting = meetingIdMeeting;
    }

    @OneToMany(mappedBy = "meetingCacheByMeetingCacheIdUserCache")
    public Collection<MeetingEntity> getMeetingsByIdUserCache() {
        return meetingsByIdUserCache;
    }

    public void setMeetingsByIdUserCache(Collection<MeetingEntity> meetingsByIdUserCache) {
        this.meetingsByIdUserCache = meetingsByIdUserCache;
    }

    @ManyToOne
    @JoinColumn(name = "user_id_user", referencedColumnName = "id_user")
    public UserEntity getUserByUserIdUser() {
        return userByUserIdUser;
    }

    public void setUserByUserIdUser(UserEntity userByUserIdUser) {
        this.userByUserIdUser = userByUserIdUser;
    }
}
