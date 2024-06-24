package org.luiscarlos.sistemagerenciamentotarefas.service;

import java.util.List;

import org.luiscarlos.sistemagerenciamentotarefas.entity.Task;

public interface TaskService {
    List<Task> getAllTasks();

    Task getTaskById(Long id);

    void createTask(Task task);

    void updateTask(Task task);

    void deleteTask(Long id);
}
