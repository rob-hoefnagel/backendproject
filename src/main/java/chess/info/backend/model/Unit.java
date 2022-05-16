package chess.info.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unit {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private long id;
	private byte attack;
	private byte defence;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//	private String icon;
	private UnitType type;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public byte getAttack() {
		return attack;
	}
	public void setAttack(byte attack) {
		this.attack = attack;
	}
	public byte getDefence() {
		return defence;
	}
	public void setDefence(byte defence) {
		this.defence = defence;
	}
//	public String getIcon() {
//		return icon;
//	}
//	public void setIcon(String icon) {
//		this.icon = icon;
//	}
	public UnitType getType() {
		return type;
	}
	public void setType(UnitType type) {
		this.type = type;
	}
	

}
