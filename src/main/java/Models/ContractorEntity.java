package Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contractor", schema = "mydb", catalog = "")
public class ContractorEntity implements Serializable {
    private int id;
    private Integer clientSegment;
    private String fullName;
    private ClientsegmentEntity clientsegmentByClientSegment;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ClientSegment", nullable = true)
    public Integer getClientSegment() {
        return clientSegment;
    }

    public void setClientSegment(Integer clientSegment) {
        this.clientSegment = clientSegment;
    }

    @Basic
    @Column(name = "FullName", nullable = true, length = 150)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContractorEntity that = (ContractorEntity) o;

        if (id != that.id) return false;
        if (clientSegment != null ? !clientSegment.equals(that.clientSegment) : that.clientSegment != null)
            return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (clientSegment != null ? clientSegment.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ClientSegment", referencedColumnName = "Id", insertable = false, updatable = false)
    public ClientsegmentEntity getClientsegmentByClientSegment() {
        return clientsegmentByClientSegment;
    }

    public void setClientsegmentByClientSegment(ClientsegmentEntity clientsegmentByClientSegment) {
        this.clientsegmentByClientSegment = clientsegmentByClientSegment;
    }
}
