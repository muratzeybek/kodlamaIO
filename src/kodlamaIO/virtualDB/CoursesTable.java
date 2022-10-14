package kodlamaIO.virtualDB;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.entities.Course;

public class CoursesTable {
	public List<Course> getCourses() {
		List<Course> courses = new ArrayList<>();
		courses.add(new Course(1, "Java", "Haydi Java Öğrrenmeye", 1, 1, 0, "java.jpg"));
		courses.add(new Course(2, "C#", "Haydi C# Öğrrenmeye", 1, 2, 549.99, "csharp.jpg"));
		courses.add(new Course(3, "Phyton", "Haydi Phyton Öğrrenmeye", 1, 3, 499.99, "phyton.jpg"));
		courses.add(new Course(4, "Arduino", "Haydi Ardino Öğrrenmeye", 3, 4, 249.99, "arduino.jpg"));
		return courses;
	}
}
