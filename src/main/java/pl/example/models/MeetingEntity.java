package pl.example.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "meeting", schema = "public", catalog = "d2b6rsc8m7io0b")
public class MeetingEntity {
    private int idMeeting;
    private int meetingPlace;
    private Date date;
    private Date time;
    private int subjectIdSubject;
    private Integer userIdUser;
    private int meetingCacheIdUserCache;
    private SubjectEntity subjectBySubjectIdSubject;
    private UserEntity userByUserIdUser;
    private MeetingCacheEntity meetingCacheByMeetingCacheIdUserCache;
    private Collection<MeetingCacheEntity> meetingCachesByIdMeeting;
    private Collection<NoticeEntity> noticesByIdMeeting;

    @Id
    @Column(name = "id_meeting", nullable = false)
    public int getIdMeeting() {
        return idMeeting;
    }

    public void setIdMeeting(int idMeeting) {
        this.idMeeting = idMeeting;
    }

    @Basic
    @Column(name = "meeting_place", nullable = false)
    public int getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(int meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MeetingEntity that = (MeetingEntity) o;

        if (idMeeting != that.idMeeting) return false;
        if (meetingPlace != that.meetingPlace) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMeeting;
        result = 31 * result + meetingPlace;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "subject_id_subject", nullable = false)
    public int getSubjectIdSubject() {
        return subjectIdSubject;
    }

    public void setSubjectIdSubject(int subjectIdSubject) {
        this.subjectIdSubject = subjectIdSubject;
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
    @Column(name = "meeting_cache_id_user_cache", nullable = false)
    public int getMeetingCacheIdUserCache() {
        return meetingCacheIdUserCache;
    }

    public void setMeetingCacheIdUserCache(int meetingCacheIdUserCache) {
        this.meetingCacheIdUserCache = meetingCacheIdUserCache;
    }

    @ManyToOne
    @JoinColumn(name = "subject_id_subject", referencedColumnName = "id_subject", nullable = false)
    public SubjectEntity getSubjectBySubjectIdSubject() {
        return subjectBySubjectIdSubject;
    }

    public void setSubjectBySubjectIdSubject(SubjectEntity subjectBySubjectIdSubject) {
        this.subjectBySubjectIdSubject = subjectBySubjectIdSubject;
    }

    @ManyToOne
    @JoinColumn(name = "user_id_user", referencedColumnName = "id_user")
    public UserEntity getUserByUserIdUser() {
        return userByUserIdUser;
    }

    public void setUserByUserIdUser(UserEntity userByUserIdUser) {
        this.userByUserIdUser = userByUserIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "meeting_cache_id_user_cache", referencedColumnName = "id_user_cache", nullable = false)
    public MeetingCacheEntity getMeetingCacheByMeetingCacheIdUserCache() {
        return meetingCacheByMeetingCacheIdUserCache;
    }

    public void setMeetingCacheByMeetingCacheIdUserCache(MeetingCacheEntity meetingCacheByMeetingCacheIdUserCache) {
        this.meetingCacheByMeetingCacheIdUserCache = meetingCacheByMeetingCacheIdUserCache;
    }

    @OneToMany(mappedBy = "meetingByMeetingIdMeeting")
    public Collection<MeetingCacheEntity> getMeetingCachesByIdMeeting() {
        return meetingCachesByIdMeeting;
    }

    public void setMeetingCachesByIdMeeting(Collection<MeetingCacheEntity> meetingCachesByIdMeeting) {
        this.meetingCachesByIdMeeting = meetingCachesByIdMeeting;
    }

    @OneToMany(mappedBy = "meetingByMeetingIdMeeting")
    public Collection<NoticeEntity> getNoticesByIdMeeting() {
        return noticesByIdMeeting;
    }

    public void setNoticesByIdMeeting(Collection<NoticeEntity> noticesByIdMeeting) {
        this.noticesByIdMeeting = noticesByIdMeeting;
    }
}
