package backend.futsal.Casa.Benfica.Portalegre.dto;

import backend.futsal.Casa.Benfica.Portalegre.entities.AdminUser;

import java.util.Date;

public class AdminUserDto {

    private long id;

    private String username;

    private Date lastModify;

    public AdminUserDto(AdminUser adminUser){
        this.id = adminUser.getId();
        this.username = adminUser.getUsername();
        this.lastModify = adminUser.getLastModify();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }
}
