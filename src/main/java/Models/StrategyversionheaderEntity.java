package Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "strategyversionheader", schema = "mydb", catalog = "")
public class StrategyversionheaderEntity {
    private int id;
    private String extCode;
    private String description;
    private Byte isDeleted;
    private Collection<ClientsegmentEntity> clientsegmentsById;
    private Collection<StrategypropertyEntity> strategypropertiesById;
    private Collection<StrategyversionheaderHasStrategypropertyEntity> strategyversionheaderHasStrategypropertiesById;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ExtCode", nullable = true, length = 20)
    public String getExtCode() {
        return extCode;
    }

    public void setExtCode(String extCode) {
        this.extCode = extCode;
    }

    @Basic
    @Column(name = "Description", nullable = true, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "IsDeleted", nullable = true)
    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StrategyversionheaderEntity that = (StrategyversionheaderEntity) o;

        if (id != that.id) return false;
        if (extCode != null ? !extCode.equals(that.extCode) : that.extCode != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (extCode != null ? extCode.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "strategyversionheaderByCurrentStrategyVersionHeader")
    public Collection<ClientsegmentEntity> getClientsegmentsById() {
        return clientsegmentsById;
    }

    public void setClientsegmentsById(Collection<ClientsegmentEntity> clientsegmentsById) {
        this.clientsegmentsById = clientsegmentsById;
    }

    @OneToMany(mappedBy = "strategyversionheaderByStrategyVersionHeader")
    public Collection<StrategypropertyEntity> getStrategypropertiesById() {
        return strategypropertiesById;
    }

    public void setStrategypropertiesById(Collection<StrategypropertyEntity> strategypropertiesById) {
        this.strategypropertiesById = strategypropertiesById;
    }

    @OneToMany(mappedBy = "strategyversionheaderByStrategyVersionHeaderId")
    public Collection<StrategyversionheaderHasStrategypropertyEntity> getStrategyversionheaderHasStrategypropertiesById() {
        return strategyversionheaderHasStrategypropertiesById;
    }

    public void setStrategyversionheaderHasStrategypropertiesById(Collection<StrategyversionheaderHasStrategypropertyEntity> strategyversionheaderHasStrategypropertiesById) {
        this.strategyversionheaderHasStrategypropertiesById = strategyversionheaderHasStrategypropertiesById;
    }
}
