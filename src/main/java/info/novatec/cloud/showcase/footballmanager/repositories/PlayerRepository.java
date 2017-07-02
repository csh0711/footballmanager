package info.novatec.cloud.showcase.footballmanager.repositories;

import info.novatec.cloud.showcase.footballmanager.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource
interface PlayerRepository extends JpaRepository<Player, Long> {

}