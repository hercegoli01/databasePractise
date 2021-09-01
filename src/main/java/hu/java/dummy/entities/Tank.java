package hu.java.dummy.entities;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tank")
@Entity
public class Tank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "last_modified_date", nullable = false)
    private Date lastModfiedDate;

    public Tank() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModfiedDate() {
        return lastModfiedDate;
    }

    public void setLastModfiedDate(Date lastModfiedDate) {
        this.lastModfiedDate = lastModfiedDate;
    }
}
