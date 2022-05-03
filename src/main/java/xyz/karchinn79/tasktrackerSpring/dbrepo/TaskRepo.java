package xyz.karchinn79.tasktrackerSpring.dbrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.karchinn79.tasktrackerSpring.entity.Task;

public interface TaskRepo extends JpaRepository<Task, Integer> {
    //public boolean existsTaskById(int id);
}
