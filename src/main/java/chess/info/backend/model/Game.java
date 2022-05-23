package chess.info.backend.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Game {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	
	private long id;
	private String name;
	private LocalDateTime datetime;
//	private Player player1;
//	private Player player2;
	
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
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
//	public Player getPlayer1() {
//		return player1;
//	}
//	public void setPlayer1(Player player1) {
//		this.player1 = player1;
//	}
//	public Player getPlayer2() {
//		return player2;
//	}
//	public void setPlayer2(Player player2) {
//		this.player2 = player2;
//	}

	
}
