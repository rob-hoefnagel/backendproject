package chess.info.backend.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import chess.info.backend.Service.PlayerService;
import chess.info.backend.model.Player;

@RestController
public class PlayerController {
	@GetMapping("test")
	public String wegaan() {
	System.out.println("We gaan");
	return "Nieuwe speler";
	}
	
	@Autowired
	PlayerService playerservice; //= new playerService;
	
	@GetMapping("newPlayer")
	public String maakSpeler() {
		Player x = new Player();
		playerservice.slaSpelerOp(x);
		System.out.println("Nieuwe speler aangemaakt");
		return "Speler A";
	}
	
	@GetMapping("newPlayer1/{bijnaam}")
	public String maakSpeler1(@PathVariable("bijnaam") String bijnamen) {
		Player x = new Player();
		x.setNickname(bijnamen);
		playerservice.slaSpelerOp(x);
		System.out.println("NIeuwe Speler aangemaakt");
		return "Speler B";
	}
	
	@PostMapping("newPlayer2")
	public String maakSpeler2(@RequestBody Player speler) {
		playerservice.slaSpelerOp(speler);
		System.out.println("NIeuwe Speler aangemaakt");
		return "Speler B";
	}
	
	@GetMapping("totaalSpelers")
	public List<Player> gaan() {
		
	return playerservice.geefAlleSpelers();
	
	}
	@GetMapping("verkrijgSpelerById/{spelerid}")
	public Player verkrijgSpeler(@PathVariable("spelerid") int spelerid) {
		return playerservice.getPlayerById(spelerid);
	}
		
}

