package org.itglance.docsea.repository;

import org.itglance.docsea.domain.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SessionRepository extends JpaRepository<Session,String>{

    @Query("select a from Session a where a.token=token")
    Optional<Session> findByToken(@Param("token") String token);

}
