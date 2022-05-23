package chess.info.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chess.info.backend.model.AccountDefaultUnit;
import chess.info.backend.model.Unit;

@Service
public class AccountDefaultUnitService {
	@Autowired
	AccountDefaultUnitRepository accountDefaultRepository;
	
	
	public List<AccountDefaultUnit> geefAlleLijsten() {
		return accountDefaultRepository.findAll();
	}
	
	public void slaLijstop(AccountDefaultUnit unit) {
		accountDefaultRepository.save(unit);
	}
	
	
}
