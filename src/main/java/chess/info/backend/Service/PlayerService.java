package chess.info.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chess.info.backend.model.Player;

@Service
public class PlayerService {
	@Autowired
	PlayerRepository playerRepository;
	
	public List<Player> geefAlleSpelers() {
		return playerRepository.findAll();
	}
	
	public Player slaSpelerOp(Player speler) {
		return playerRepository.save(speler);
	}

	public Player getPlayerById(long spelerid) {
		return playerRepository.findById(spelerid).get();
	}

}
