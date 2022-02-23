package backend.futsal.Casa.Benfica.Portalegre.dto;

import backend.futsal.Casa.Benfica.Portalegre.entities.Player;

import java.util.Date;
import java.util.Optional;

public class PlayerDto {

    private long id;

    private String fullName;

    private String nickName;

    private int number;

    private Date birthDate;

    public PlayerDto(long id, String fullName, String nickName, int number, Date birthDate) {
        this.id = id;
        this.fullName = fullName;
        this.nickName = nickName;
        this.number = number;
        this.birthDate = birthDate;
    }

    public PlayerDto(Player player){
        this.id = player.getId();
        this.fullName = player.getNickName();
        this.nickName = player.getFullName();
        this.number = player.getNumber();
        this.birthDate = player.getBirthDate();
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
