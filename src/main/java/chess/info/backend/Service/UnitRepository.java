package chess.info.backend.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import chess.info.backend.model.Player;
import chess.info.backend.model.Unit;


@Component
public interface UnitRepository extends JpaRepository <Unit,Long>{


}
