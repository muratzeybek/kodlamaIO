package kodlamaIO.core.validator;

import java.util.List;

import kodlamaIO.entities.Instructor;
import kodlamaIO.virtualDB.InstructorsTable;

public class InstructorValidator implements Validator 
{
	public boolean ValidName(List<Instructor> instructors, String name) {
		// My virtual database source
		instructors = new InstructorsTable().getInstructors();
		for (Instructor instructor : instructors) {
			if (instructor.getInstructorFirstName().equals(name))
				return false;
		}
		return true;
	}
}
