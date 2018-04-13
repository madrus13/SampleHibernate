package Models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class StrategypropertyHasStrategyactiontypeEntityPK implements Serializable {
    private int strategyPropertyId;
    private int strategyActionTypeId;

    @Column(name = "StrategyProperty_Id", nullable = false)
    @Id
    public int getStrategyPropertyId() {
        return strategyPropertyId;
    }

    public void setStrategyPropertyId(int strategyPropertyId) {
        this.strategyPropertyId = strategyPropertyId;
    }

    @Column(name = "StrategyActionType_Id", nullable = false)
    @Id
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

        StrategypropertyHasStrategyactiontypeEntityPK that = (StrategypropertyHasStrategyactiontypeEntityPK) o;

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
