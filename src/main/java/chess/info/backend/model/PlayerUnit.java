package chess.info.backend.model;

public class PlayerUnit {
	
	private long id;
	private Player player;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	private Unit unit;

}
