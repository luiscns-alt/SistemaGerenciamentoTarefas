package org.luiscarlos.sistemagerenciamentotarefas.repository;

import java.util.List;

import org.luiscarlos.sistemagerenciamentotarefas.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>, TaskRepositoryCustom {
    List<Task> findByStatus(String status);
}


