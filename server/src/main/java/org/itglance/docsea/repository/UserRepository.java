package org.itglance.docsea.repository;


import org.itglance.docsea.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bishal on 5/23/17.
 */
public interface UserRepository extends JpaRepository<User,Long>{

}