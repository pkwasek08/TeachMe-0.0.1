package pl.example.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "subject", schema = "public", catalog = "d2b6rsc8m7io0b")
public class SubjectEntity {
    private int idSubject;
    private String name;
    private SubjectEntity subjectBySubjectIdSubject;
    private Integer subjectIdSubject;
    private Collection<MeetingEntity> meetingsByIdSubject;
    private Collection<NoticeEntity> noticesByIdSubject;
    private Collection<SubjectEntity> subjectsByIdSubject;

    @Id
    @Column(name = "id_subject", nullable = false)
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 127)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectEntity that = (SubjectEntity) o;

        if (idSubject != that.idSubject) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSubject;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "subject_id_subject", referencedColumnName = "id_subject")
    public SubjectEntity getSubjectBySubjectIdSubject() {
        return subjectBySubjectIdSubject;
    }

    public void setSubjectBySubjectIdSubject(SubjectEntity subjectBySubjectIdSubject) {
        this.subjectBySubjectIdSubject = subjectBySubjectIdSubject;
    }

    @Basic
    @Column(name = "subject_id_subject", nullable = true)
    public Integer getSubjectIdSubject() {
        return subjectIdSubject;
    }

    public void setSubjectIdSubject(Integer subjectIdSubject) {
        this.subjectIdSubject = subjectIdSubject;
    }

    @OneToMany(mappedBy = "subjectBySubjectIdSubject")
    public Collection<MeetingEntity> getMeetingsByIdSubject() {
        return meetingsByIdSubject;
    }

    public void setMeetingsByIdSubject(Collection<MeetingEntity> meetingsByIdSubject) {
        this.meetingsByIdSubject = meetingsByIdSubject;
    }

    @OneToMany(mappedBy = "subjectBySubjectIdSubject")
    public Collection<NoticeEntity> getNoticesByIdSubject() {
        return noticesByIdSubject;
    }

    public void setNoticesByIdSubject(Collection<NoticeEntity> noticesByIdSubject) {
        this.noticesByIdSubject = noticesByIdSubject;
    }

    @OneToMany(mappedBy = "subjectBySubjectIdSubject")
    public Collection<SubjectEntity> getSubjectsByIdSubject() {
        return subjectsByIdSubject;
    }

    public void setSubjectsByIdSubject(Collection<SubjectEntity> subjectsByIdSubject) {
        this.subjectsByIdSubject = subjectsByIdSubject;
    }
}
