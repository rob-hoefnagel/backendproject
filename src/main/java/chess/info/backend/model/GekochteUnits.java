package chess.info.backend.model;

public class GekochteUnits {

	private long id;
	private Unit unit;
	private Account account;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
