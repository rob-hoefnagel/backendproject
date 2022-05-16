package chess.info.backend.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import chess.info.backend.Service.UnitRepository;
import chess.info.backend.Service.UnitService;
import chess.info.backend.model.Player;
import chess.info.backend.model.Unit;

@RestController
public class UnitController {
	
	@Autowired
	UnitService unitservice; //= new unitService;
	
//	@GetMapping("newUnit")
//	public String maakUnit() {
//		Unit x = new Unit();
//		unitservice.slaUnitOp(x);
//		System.out.println("Nieuwe Unit aangemaakt");
//		return "Unit 1";
//	}
//	
	@PostMapping("newUnit")
	public void maakUnit(@RequestBody Unit unit) {
		unitservice.slaUnitOp(unit);

	}
	
	@GetMapping("totalUnits")
	public List<Unit> unitLijst() {
	return unitservice.geefAlleUnits();
	
	}
	
	@DeleteMapping("deleteUnit/{id}")
	public void deleteUnit(@PathVariable("unitid")long unitid) {
		unitservice.deleteUnit(unitid);
		
	}
	
	
	
		
}
