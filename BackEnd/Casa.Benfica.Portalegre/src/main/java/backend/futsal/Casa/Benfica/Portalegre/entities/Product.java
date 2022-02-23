package backend.futsal.Casa.Benfica.Portalegre.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Product {


    @Id
    @GeneratedValue
    long id;

    String name;

    String Description;

    Double value;

    Date lastModify;

    public Product() {
    }

    public Product(long id, String name, String description, Double value, Date lastModify) {
        this.id = id;
        this.name = name;
        Description = description;
        this.value = value;
        this.lastModify = lastModify;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }
}
