package backend.futsal.Casa.Benfica.Portalegre.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class AdminUser {

    @Id
    @GeneratedValue
    @SequenceGenerator(name="adminUser_generator", sequenceName ="adminUser_seq")
    private Long id;

    private String username;

    private String password;

    private Date lastModify;


    public AdminUser() {
    }

    public AdminUser(Long id, String username, String password, Date lastModify) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.lastModify = lastModify;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }
}
