package kodlamaIO.core.validator;

import java.util.List;

import kodlamaIO.entities.Course;
import kodlamaIO.virtualDB.CoursesTable;

public class CourseValidator implements Validator {
	public boolean validCourseName(List<Course> courses, String name) {
		courses = new CoursesTable().getCourses();
		for (Course course : courses) {
			if (course.getCourseName().equals(name))
				return false;
		}
		return true;
	}
	
	public boolean validPrice (double price) {
		if (price < 0)
			return false;
		else
			return true;
	}
}
