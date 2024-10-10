package com.bastola.taskorganizer.OrganizeIt.repositories;

import com.bastola.taskorganizer.OrganizeIt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
