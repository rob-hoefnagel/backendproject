package chess.info.backend.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import chess.info.backend.model.Player;


@Component
public interface PlayerRepository extends JpaRepository <Player,Long>{

	
}
