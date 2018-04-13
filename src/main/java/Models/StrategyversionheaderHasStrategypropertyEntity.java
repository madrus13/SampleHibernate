package Models;

import javax.persistence.*;

@Entity
@Table(name = "strategyversionheader_has_strategyproperty", schema = "mydb", catalog = "")
@IdClass(StrategyversionheaderHasStrategypropertyEntityPK.class)
public class StrategyversionheaderHasStrategypropertyEntity {
    private int strategyVersionHeaderId;
    private int strategyPropertyId;
    private StrategyversionheaderEntity strategyversionheaderByStrategyVersionHeaderId;
    private StrategypropertyEntity strategypropertyByStrategyPropertyId;

    @Id
    @Column(name = "StrategyVersionHeader_Id", nullable = false)
    public int getStrategyVersionHeaderId() {
        return strategyVersionHeaderId;
    }

    public void setStrategyVersionHeaderId(int strategyVersionHeaderId) {
        this.strategyVersionHeaderId = strategyVersionHeaderId;
    }

    @Id
    @Column(name = "StrategyProperty_Id", nullable = false)
    public int getStrategyPropertyId() {
        return strategyPropertyId;
    }

    public void setStrategyPropertyId(int strategyPropertyId) {
        this.strategyPropertyId = strategyPropertyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StrategyversionheaderHasStrategypropertyEntity that = (StrategyversionheaderHasStrategypropertyEntity) o;

        if (strategyVersionHeaderId != that.strategyVersionHeaderId) return false;
        if (strategyPropertyId != that.strategyPropertyId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = strategyVersionHeaderId;
        result = 31 * result + strategyPropertyId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "StrategyVersionHeader_Id", referencedColumnName = "Id", nullable = false)
    public StrategyversionheaderEntity getStrategyversionheaderByStrategyVersionHeaderId() {
        return strategyversionheaderByStrategyVersionHeaderId;
    }

    public void setStrategyversionheaderByStrategyVersionHeaderId(StrategyversionheaderEntity strategyversionheaderByStrategyVersionHeaderId) {
        this.strategyversionheaderByStrategyVersionHeaderId = strategyversionheaderByStrategyVersionHeaderId;
    }

    @ManyToOne
    @JoinColumn(name = "StrategyProperty_Id", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false)
    public StrategypropertyEntity getStrategypropertyByStrategyPropertyId() {
        return strategypropertyByStrategyPropertyId;
    }

    public void setStrategypropertyByStrategyPropertyId(StrategypropertyEntity strategypropertyByStrategyPropertyId) {
        this.strategypropertyByStrategyPropertyId = strategypropertyByStrategyPropertyId;
    }
}
