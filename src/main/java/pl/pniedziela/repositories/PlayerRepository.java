package pl.pniedziela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.pniedziela.entities.Player;

import java.util.List;

/**
 * Created by Przemysław on 02.02.2017.
 */
@Transactional
public interface PlayerRepository extends JpaRepository<Player, Long> {

    public Player save(Player player);
}
