package chess.info.backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import chess.info.backend.model.Unit;

@Service
public class UnitService {
	@Autowired
	UnitRepository unitRepository;
	
	public List<Unit> geefAlleUnits() {
		return unitRepository.findAll();
	}
	
	public void slaUnitOp(Unit unit) {
		unitRepository.save(unit);
	}

	public void deleteUnit(long unitid) {
		unitRepository.deleteById(unitid);
		
	}
	
	public Optional<Unit> geefUnit(long unitid) {
		return unitRepository.findById(unitid);
		
	}

	public void wijzigUnit(long unitid) {
		unitRepository.findById(unitid);
		
	}

}