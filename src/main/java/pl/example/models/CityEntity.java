package pl.example.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "city", schema = "public", catalog = "d2b6rsc8m7io0b")
public class CityEntity {
    private int idCity;
    private String name;
    private int voivodeshipIdVoivodeship;
    private VoivodeshipEntity voivodeshipByVoivodeshipIdVoivodeship;
    private Collection<UserEntity> usersByIdCity;
    private Collection<UserEntity> usersByIdCity_0;

    @Id
    @Column(name = "id_city", nullable = false)
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
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

        CityEntity that = (CityEntity) o;

        if (idCity != that.idCity) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCity;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "voivodeship_id_voivodeship", nullable = false)
    public int getVoivodeshipIdVoivodeship() {
        return voivodeshipIdVoivodeship;
    }

    public void setVoivodeshipIdVoivodeship(int voivodeshipIdVoivodeship) {
        this.voivodeshipIdVoivodeship = voivodeshipIdVoivodeship;
    }

    @ManyToOne
    @JoinColumn(name = "voivodeship_id_voivodeship", referencedColumnName = "id_voivodeship", nullable = false)
    public VoivodeshipEntity getVoivodeshipByVoivodeshipIdVoivodeship() {
        return voivodeshipByVoivodeshipIdVoivodeship;
    }

    public void setVoivodeshipByVoivodeshipIdVoivodeship(VoivodeshipEntity voivodeshipByVoivodeshipIdVoivodeship) {
        this.voivodeshipByVoivodeshipIdVoivodeship = voivodeshipByVoivodeshipIdVoivodeship;
    }

    @OneToMany(mappedBy = "cityByCityIdCity")
    public Collection<UserEntity> getUsersByIdCity() {
        return usersByIdCity;
    }

    public void setUsersByIdCity(Collection<UserEntity> usersByIdCity) {
        this.usersByIdCity = usersByIdCity;
    }

    @OneToMany(mappedBy = "cityByCityIdCity2")
    public Collection<UserEntity> getUsersByIdCity_0() {
        return usersByIdCity_0;
    }

    public void setUsersByIdCity_0(Collection<UserEntity> usersByIdCity_0) {
        this.usersByIdCity_0 = usersByIdCity_0;
    }
}
