package Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "strategyproperty", schema = "mydb", catalog = "")
public class StrategypropertyEntity {
    private int id;
    private String extCode;
    private int strategyVersionHeader;
    private Integer dateOffset;
    private Integer eventType;
    private String description;
    private Byte isDeleted;
    private int actionType;
    private StrategyversionheaderEntity strategyversionheaderByStrategyVersionHeader;
    private StrategyeventtypeEntity strategyeventtypeByEventType;
    private StrategyactiontypeEntity strategyactiontypeByActionType;
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
    @Column(name = "StrategyVersionHeader", nullable = false)
    public int getStrategyVersionHeader() {
        return strategyVersionHeader;
    }

    public void setStrategyVersionHeader(int strategyVersionHeader) {
        this.strategyVersionHeader = strategyVersionHeader;
    }

    @Basic
    @Column(name = "DateOffset", nullable = true)
    public Integer getDateOffset() {
        return dateOffset;
    }

    public void setDateOffset(Integer dateOffset) {
        this.dateOffset = dateOffset;
    }

    @Basic
    @Column(name = "EventType", nullable = true)
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
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

    @Basic
    @Column(name = "ActionType", nullable = false)
    public int getActionType() {
        return actionType;
    }

    public void setActionType(int actionType) {
        this.actionType = actionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StrategypropertyEntity that = (StrategypropertyEntity) o;

        if (id != that.id) return false;
        if (strategyVersionHeader != that.strategyVersionHeader) return false;
        if (actionType != that.actionType) return false;
        if (extCode != null ? !extCode.equals(that.extCode) : that.extCode != null) return false;
        if (dateOffset != null ? !dateOffset.equals(that.dateOffset) : that.dateOffset != null) return false;
        if (eventType != null ? !eventType.equals(that.eventType) : that.eventType != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (extCode != null ? extCode.hashCode() : 0);
        result = 31 * result + strategyVersionHeader;
        result = 31 * result + (dateOffset != null ? dateOffset.hashCode() : 0);
        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + actionType;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StrategyVersionHeader", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    public StrategyversionheaderEntity getStrategyversionheaderByStrategyVersionHeader() {
        return strategyversionheaderByStrategyVersionHeader;
    }

    public void setStrategyversionheaderByStrategyVersionHeader(StrategyversionheaderEntity strategyversionheaderByStrategyVersionHeader) {
        this.strategyversionheaderByStrategyVersionHeader = strategyversionheaderByStrategyVersionHeader;
    }

    @ManyToOne
    @JoinColumn(name = "EventType", referencedColumnName = "Id", insertable = false, updatable = false)
    public StrategyeventtypeEntity getStrategyeventtypeByEventType() {
        return strategyeventtypeByEventType;
    }

    public void setStrategyeventtypeByEventType(StrategyeventtypeEntity strategyeventtypeByEventType) {
        this.strategyeventtypeByEventType = strategyeventtypeByEventType;
    }

    @ManyToOne
    @JoinColumn(name = "ActionType", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    public StrategyactiontypeEntity getStrategyactiontypeByActionType() {
        return strategyactiontypeByActionType;
    }

    public void setStrategyactiontypeByActionType(StrategyactiontypeEntity strategyactiontypeByActionType) {
        this.strategyactiontypeByActionType = strategyactiontypeByActionType;
    }

    @OneToMany(mappedBy = "strategypropertyByStrategyPropertyId")
    public Collection<StrategyversionheaderHasStrategypropertyEntity> getStrategyversionheaderHasStrategypropertiesById() {
        return strategyversionheaderHasStrategypropertiesById;
    }

    public void setStrategyversionheaderHasStrategypropertiesById(Collection<StrategyversionheaderHasStrategypropertyEntity> strategyversionheaderHasStrategypropertiesById) {
        this.strategyversionheaderHasStrategypropertiesById = strategyversionheaderHasStrategypropertiesById;
    }
}
