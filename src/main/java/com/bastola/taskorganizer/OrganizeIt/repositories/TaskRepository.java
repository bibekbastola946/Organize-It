package com.bastola.taskorganizer.OrganizeIt.repositories;

import com.bastola.taskorganizer.OrganizeIt.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
