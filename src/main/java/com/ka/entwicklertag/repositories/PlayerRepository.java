package com.ka.entwicklertag.repositories;

import com.ka.entwicklertag.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface PlayerRepository extends JpaRepository<Player, Long> {

}