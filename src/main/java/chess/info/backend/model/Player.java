package chess.info.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Player {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String nickname;
//	private int turnOrder;
	
	@ManyToMany
	private List<Game> game;
private int turnOrder;
	//private Account account;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
//	public Faction getFaction() {
//		return faction;
//	}
//	public void setFaction(Faction faction) {
//		this.faction = faction;
//	}
	public int getTurnOrder() {
		return turnOrder;
	}
	public void setTurnOrder(int turnOrder) {
		this.turnOrder = turnOrder;
	}
//	public Game getGame() {
//		return game;
//	}
//	public void setGame(Game game) {
//		this.game = game;
//	}
//	public Account getAccount() {
//		return account;
//	}
//	public void setAccount(Account account) {
//		this.account = account;
//	}

  }
