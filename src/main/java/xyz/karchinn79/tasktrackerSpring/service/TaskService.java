package xyz.karchinn79.tasktrackerSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.karchinn79.tasktrackerSpring.dbrepo.TaskRepo;
import xyz.karchinn79.tasktrackerSpring.entity.Task;

import java.util.List;

@Service
public class TaskService implements TaskServ{
    @Autowired
    TaskRepo TaskManager;

    public List<Task> getAllTasks(){
        return TaskManager.findAll();
    }
    public Task getTaskById(int id){
        return TaskManager.getById(id);
    }
    public void addTask(Task task){

        TaskManager.save(task);
    }
    public void deleteTask(int id){
        TaskManager.deleteById(id);
    }

}
