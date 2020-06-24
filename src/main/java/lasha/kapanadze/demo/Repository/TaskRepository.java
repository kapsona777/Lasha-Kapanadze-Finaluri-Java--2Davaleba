package lasha.kapanadze.demo.Repository;

import lasha.kapanadze.demo.Model.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository <Task, Long> {
}
