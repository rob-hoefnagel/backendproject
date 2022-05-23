package chess.info.backend.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import chess.info.backend.Service.AccountDefaultUnitService;
import chess.info.backend.model.AccountDefaultUnit;

@RestController
public class AccountDefaultUnitController {
	
	@Autowired
	AccountDefaultUnitService accountDefaultUnitservice;
	
	@PostMapping("lijstOpslaan")
	public void lijstOpslaan (@RequestBody AccountDefaultUnit accountdefaultunit ) {
		accountDefaultUnitservice.slaLijstop(accountdefaultunit);
	}
	
	@GetMapping("toonLijsten")
	public List<AccountDefaultUnit> haalLijstOp(){
		return accountDefaultUnitservice.geefAlleLijsten();
	}
	

}
