package chess.info.backend.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import chess.info.backend.model.Game;

@Component
public interface GameRepository extends JpaRepository<Game,Long>{

}
