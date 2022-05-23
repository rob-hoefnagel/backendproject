package chess.info.backend.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import chess.info.backend.Service.GameService;
import chess.info.backend.model.Game;

@RestController
public class GameController {

	@Autowired
	GameService gs;
	
	@GetMapping("allegames")
	public List<Game> alleGames(){
		return gs.getAlleGames();
	}
	@PostMapping("creategame")
	public void createGame(@RequestBody Game spel) {
		gs.createSpel(spel);
	}
	@GetMapping("getGame/{spelid}")
	public Game getGameById(@PathVariable("spelid") int spelid) {
		return gs.getGameById(spelid);
	}
}
