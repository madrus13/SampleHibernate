package Models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class StrategyversionheaderHasStrategypropertyEntityPK implements Serializable {
    private int strategyVersionHeaderId;
    private int strategyPropertyId;

    @Column(name = "StrategyVersionHeader_Id", nullable = false, insertable = false, updatable = false)
    @Id
    public int getStrategyVersionHeaderId() {
        return strategyVersionHeaderId;
    }

    public void setStrategyVersionHeaderId(int strategyVersionHeaderId) {
        this.strategyVersionHeaderId = strategyVersionHeaderId;
    }

    @Column(name = "StrategyProperty_Id", nullable = false)
    @Id
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

        StrategyversionheaderHasStrategypropertyEntityPK that = (StrategyversionheaderHasStrategypropertyEntityPK) o;

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
}
