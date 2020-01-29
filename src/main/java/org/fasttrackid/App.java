package org.fasttrackid;

import org.fasttrackid.domain.Task;
import org.persistance.TaskRepository;
import org.transfer.CreateTaskRequest;
import org.transfer.UpdateTaskRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, SQLException, ClassNotFoundException {
        TaskRepository taskRepository = new TaskRepository();
        CreateTaskRequest request = new CreateTaskRequest();
        request.setDescription("learn JDBC");
        request.setDeadline(LocalDate.now().plusWeeks(1));

        taskRepository.createTask(request);
        List<Task> tasks = taskRepository.getTasks();
        System.out.println(tasks);


//        UpdateTaskRequest request = new UpdateTaskRequest();
//        request.setDone(true);
//        taskRepository.updateTask(1,request);


    }
}
