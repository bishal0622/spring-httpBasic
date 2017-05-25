package org.itglance.docsea.repository;

import org.itglance.docsea.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(Long id);

    @Query("select p from User p where p.name=name AND p.password=pasword")
    Optional<User> findByNameAndAndPassword(@Param("name") String name, @Param("password") String password);

}