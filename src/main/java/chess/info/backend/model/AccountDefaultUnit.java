package chess.info.backend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AccountDefaultUnit {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
//	private Account account;
	@ManyToMany
	private List<Unit> unit;
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	String naam;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
//	public Account getAccount() {
//		return account;
//	}
//	public void setAccount(Account account) {
//		this.account = account;
//	}
	public List <Unit> getUnit() {
		return unit;
	}
	public void setUnit(List <Unit> unit) {
		this.unit = unit;
	}
	public List<Unit> findAll() {
		return unit;
	}

}
