package org.luiscarlos.sistemagerenciamentotarefas.service;

import java.util.List;

import org.luiscarlos.sistemagerenciamentotarefas.entity.Task;
import org.luiscarlos.sistemagerenciamentotarefas.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public void createTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void updateTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
