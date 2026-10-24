package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Task.Task;
class TaskTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	@DisplayName("Constructor")
	void validConstructor(){
		String id= "1";
		String fullName="Open";
		String description="Task opens page.";
		Task tempTask = new Task(id, fullName, description);
		assertEquals(1,tempTask.getId());
		assertEquals(fullName,tempTask.getFullName());
		assertEquals(description,tempTask.getDescription());
		
		
	}
	@Test
	@DisplayName("Invalid description")
	void inValidConstructor(){
		String id= "1";
		String fullName="Open";
		String description="Task opens page but will not work as the dicription charate limit is exceded !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
		
		Task tempTask = new Task(id, fullName, description);
		Assertions.assertThrows(IllegalArgumentException.class,()-> { Task task = new Task(id, fullName, description);});
	}
		
	@Test
	@DisplayName("Invalid description")
	void inValidDescriptionNull(){
		String id= "1";
		String fullName="Open";
		String description=null;
		Task tempTask = new Task(id, fullName, description);
		Assertions.assertThrows(IllegalArgumentException.class,()-> { Task task = new Task(id, fullName, description);});
	}
	@Test
	@DisplayName("Test Invalid Id to long")
	void InvalidIdLong(){
		String id= "12345678902334";
		String fullName="Open";
		String description="Task opens page.";
		Task tempTask = new Task(id, fullName, description);
		Assertions.assertThrows(IllegalArgumentException.class,()-> { Task task = new Task(id, fullName, description);});
	}


	@Test
	@DisplayName("Test Invalid Id is null")
	void InvalidIdNull(){
		String id= null;
		String fullName="Open";
		String description="Task opens page.";
		Task tempTask = new Task(id, fullName, description);
		Assertions.assertThrows(IllegalArgumentException.class,()-> { Task task = new Task(id, fullName, description);});
}
	@Test
	@DisplayName("Test Invalid name to long")
	void InvalidNameLong(){
		String id= "123456";
		String fullName="Open this web page as it leads to";
		String description="Task opens page.";
		Task tempTask = new Task(id, fullName, description);
		Assertions.assertThrows(IllegalArgumentException.class,()-> { Task task = new Task(id, fullName, description);});
	}

	@Test
	@DisplayName("Test Invalid name is null")
	void InvalidNameNull(){
		String id= "123456";
		String fullName=null;
		String description="Task opens page.";
		Task tempTask = new Task(id, fullName, description);
		Assertions.assertThrows(IllegalArgumentException.class,()-> { Task task = new Task(id, fullName, description);});
	}
}