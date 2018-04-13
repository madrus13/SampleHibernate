package Models;

import javax.persistence.*;

@Entity
@Table(name = "strategyproperty_has_strategyactiontype", schema = "mydb", catalog = "")
@IdClass(StrategypropertyHasStrategyactiontypeEntityPK.class)
public class StrategypropertyHasStrategyactiontypeEntity {
    private int strategyPropertyId;
    private int strategyActionTypeId;

    @Id
    @Column(name = "StrategyProperty_Id", nullable = false)
    public int getStrategyPropertyId() {
        return strategyPropertyId;
    }

    public void setStrategyPropertyId(int strategyPropertyId) {
        this.strategyPropertyId = strategyPropertyId;
    }

    @Id
    @Column(name = "StrategyActionType_Id", nullable = false)
    public int getStrategyActionTypeId() {
        return strategyActionTypeId;
    }

    public void setStrategyActionTypeId(int strategyActionTypeId) {
        this.strategyActionTypeId = strategyActionTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StrategypropertyHasStrategyactiontypeEntity that = (StrategypropertyHasStrategyactiontypeEntity) o;

        if (strategyPropertyId != that.strategyPropertyId) return false;
        if (strategyActionTypeId != that.strategyActionTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = strategyPropertyId;
        result = 31 * result + strategyActionTypeId;
        return result;
    }
}
