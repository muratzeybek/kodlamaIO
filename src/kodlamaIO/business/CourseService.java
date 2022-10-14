package kodlamaIO.business;

import java.util.List;

import kodlamaIO.entities.Course;

public interface CourseService {
	public boolean add(Course course);
	public boolean update(int courseId);
	public boolean delete(int courseId);
	public Course getCourseById(int courseId);
	public List<Course> getAllCourses();
}
