package chess.info.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chess.info.backend.model.Game;
import chess.info.backend.model.Player;

@Service
public class GameService {
	
	@Autowired
	GameRepository gr;
	@Autowired
	PlayerRepository pr;
	public List<Game> getAlleGames() {
		return gr.findAll();
	}

	public void createSpel(Game spel, long spelerid) {
		Game g = gr.save(spel);
		Player p = pr.findById(spelerid).get();
		g.setPlayer1(p);
		gr.save(g);
	}

	public Game getGameById(long spelid) {
		return gr.findById(spelid).get();
	}

}
