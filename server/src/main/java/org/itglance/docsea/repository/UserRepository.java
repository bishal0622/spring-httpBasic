package org.itglance.docsea.repository;

import org.itglance.docsea.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bishal on 5/26/17.
 */
public interface UserRepository extends JpaRepository<Users, Long>{
}
