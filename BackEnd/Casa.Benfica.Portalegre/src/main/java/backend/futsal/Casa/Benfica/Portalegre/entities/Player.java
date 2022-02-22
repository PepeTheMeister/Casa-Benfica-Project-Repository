package backend.futsal.Casa.Benfica.Portalegre.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
	

	@Id
	@GeneratedValue
	private int id;
	
	private String fullName;
	
	private String nickName;
	
	private int number;
	
	private Date birthDate;

	public Player(int id, String fullName, String nickName, int number, Date birthDate) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.nickName = nickName;
		this.number = number;
		this.birthDate = birthDate;
	}

	public int getId() {
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
