package lesson11.problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		
		HashMap<Key, Student> hmOfStudent = new HashMap<Key, Student>();
		
		for(Student stu: students)
		{
			hmOfStudent.put(new Key(stu.getFirstName(), stu.getLastName()), stu);
		}
		
		return hmOfStudent;
	}
	
	
	
}
