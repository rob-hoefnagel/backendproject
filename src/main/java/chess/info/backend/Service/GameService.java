package chess.info.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chess.info.backend.model.Game;

@Service
public class GameService {
	
	@Autowired
	GameRepository gr;

	public List<Game> getAlleGames() {
		// TODO Auto-generated method stub
		return gr.findAll();
	}

}
