package org.luiscarlos.sistemagerenciamentotarefas.repository;

import java.util.List;

import org.luiscarlos.sistemagerenciamentotarefas.entity.Task;

public interface TaskRepositoryCustom {
    List<Task> customQueryExample();
}
