package kodlamaIO.dataAccess;

import java.util.List;

import kodlamaIO.entities.Course;

public interface CourseDao {
	public boolean add(Course course);
	public boolean update(int instructorId);
	public boolean delete(int instructorId);
	public Course getCourseById(int instructorId);
	public List<Course> getAllCourses();
}
