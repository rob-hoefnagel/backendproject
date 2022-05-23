package chess.info.backend.model;

public class AccountDefaultUnit {
	
	private long id;
	private Account account;
	private Unit unit;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}

}
