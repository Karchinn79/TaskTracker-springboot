package xyz.karchinn79.tasktrackerSpring.service;

import xyz.karchinn79.tasktrackerSpring.entity.Task;

import java.util.List;

public interface TaskServ {
    public List<Task> getAllTasks();
    public Task getTaskById(int id);
    public void addTask(Task task);
    public void deleteTask(int id);
}
