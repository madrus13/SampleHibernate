package Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "clientsegment", schema = "mydb", catalog = "")
public class ClientsegmentEntity {
    private int id;
    private String extCode;
    private String description;
    private Integer priority;
    private Integer currentStrategyVersionHeader;
    private Byte isDeleted;
    private StrategyversionheaderEntity strategyversionheaderByCurrentStrategyVersionHeader;
    private Collection<ContractorEntity> contractorsById;

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
    @Column(name = "Priority", nullable = true)
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "CurrentStrategyVersionHeader", nullable = true)
    public Integer getCurrentStrategyVersionHeader() {
        return currentStrategyVersionHeader;
    }

    public void setCurrentStrategyVersionHeader(Integer currentStrategyVersionHeader) {
        this.currentStrategyVersionHeader = currentStrategyVersionHeader;
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

        ClientsegmentEntity that = (ClientsegmentEntity) o;

        if (id != that.id) return false;
        if (extCode != null ? !extCode.equals(that.extCode) : that.extCode != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (currentStrategyVersionHeader != null ? !currentStrategyVersionHeader.equals(that.currentStrategyVersionHeader) : that.currentStrategyVersionHeader != null)
            return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (extCode != null ? extCode.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (currentStrategyVersionHeader != null ? currentStrategyVersionHeader.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CurrentStrategyVersionHeader", referencedColumnName = "Id", insertable = false, updatable = false)
    public StrategyversionheaderEntity getStrategyversionheaderByCurrentStrategyVersionHeader() {
        return strategyversionheaderByCurrentStrategyVersionHeader;
    }

    public void setStrategyversionheaderByCurrentStrategyVersionHeader(StrategyversionheaderEntity strategyversionheaderByCurrentStrategyVersionHeader) {
        this.strategyversionheaderByCurrentStrategyVersionHeader = strategyversionheaderByCurrentStrategyVersionHeader;
    }

    @OneToMany(mappedBy = "clientsegmentByClientSegment")
    public Collection<ContractorEntity> getContractorsById() {
        return contractorsById;
    }

    public void setContractorsById(Collection<ContractorEntity> contractorsById) {
        this.contractorsById = contractorsById;
    }
}
