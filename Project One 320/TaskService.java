package Task;

import java.util.HashMap;

public class TaskService {
	int currentId=0;
	
	public static HashMap<String,Task> tasks = new HashMap <String,Task>();
	
	public void addTask(String newTask,String newDescription) {
		
		String stringId = Integer.toString(currentId);
		Task tempTask =new Task (stringId, newTask,newDescription);
		tasks.put(stringId, tempTask);
		++currentId;
	}
	
	
	public void deleteTask(String id) {
		if (tasks.containsKey(id)) {
			tasks.remove(id);
			
		}
	}
	
	public void updateTasks(String id, String newName, String newDescription) {
		if(tasks.containsKey(id)) {
			tasks.get(id).setFullName(newName);
			tasks.get(id).setDescription(newDescription);
		}
	}
}
