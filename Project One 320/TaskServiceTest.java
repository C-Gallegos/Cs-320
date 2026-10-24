package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Task.Task;
import Task.TaskService;
class TaskServiceTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	@Test
	@DisplayName("Add a task")
	void addtask()
	{
		String id="0";
		String fullName="Clean";
		String description = "Clean room and sweep and mop";
		
		TaskService tempTask = new TaskService();
		assertEquals(0,TaskService.tasks.size());
		
		tempTask.addTask(fullName, description);
		
		assertTrue(TaskService.tasks.containsKey(id));
		assertEquals(fullName,TaskService.tasks.get(id).getFullName());
		assertEquals(description,TaskService.tasks.get(id).getDescription());
		
	}

	@Test
	@DisplayName("del a task")
	void deltask()
	{
		String id="0";
		String fullName="Clean";
		String description = "Clean room and sweep and mop";
		
		TaskService tempTask = new TaskService();
		assertEquals(1,TaskService.tasks.size());
		
		tempTask.addTask(fullName, description);
		tempTask.addTask(fullName, description);
		tempTask.addTask(fullName, description);
		
		tempTask.deleteTask("1");
		
		
	}

	@Test
	@DisplayName("Update a task")
	void updateTask()
	{
		String id="0";
		String fullName="Clean";
		String description = "Clean room and sweep and mop";
		
		TaskService tempTask = new TaskService();
		tempTask.addTask(fullName, description);
		tempTask.updateTasks("0", "sweep", "sweep the floors");
		
		assertEquals("sweep",TaskService.tasks.get(id).getFullName());
		assertEquals("sweep the floors",TaskService.tasks.get(id).getDescription());
	}	
}
