package org.luiscarlos.sistemagerenciamentotarefas.factory;

import java.util.List;

import org.luiscarlos.sistemagerenciamentotarefas.entity.Task;
import org.luiscarlos.sistemagerenciamentotarefas.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskFacade {

    @Autowired
    private TaskService taskService;

    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    public Task getTaskById(Long id) {
        return taskService.getTaskById(id);
    }

    public void createTask(Task task) {
        taskService.createTask(task);
    }

    public void updateTask(Task task) {
        taskService.updateTask(task);
    }

    public void deleteTask(Long id) {
        taskService.deleteTask(id);
    }
}
