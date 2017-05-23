package com.ka.entwicklertag.repositories;

import com.ka.entwicklertag.entities.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ClubRepository extends JpaRepository<Club, Long> {

}
