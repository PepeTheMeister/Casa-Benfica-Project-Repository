package backend.futsal.Casa.Benfica.Portalegre.dto;



import backend.futsal.Casa.Benfica.Portalegre.entities.Product;

import java.util.Date;

public class ProductDto {

    private long id;

    private String name;

    private String description;

    private Double value;

    private Date lastModify;

    public ProductDto(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.value = product.getValue();
        this.lastModify = product.getLastModify();
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
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
