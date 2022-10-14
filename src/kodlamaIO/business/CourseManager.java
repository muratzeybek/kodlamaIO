package kodlamaIO.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.core.logger.Logger;
import kodlamaIO.core.validator.CourseValidator;
import kodlamaIO.dataAccess.CourseDao;
import kodlamaIO.entities.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private List<Logger> loggers;

	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	@Override
	public boolean add(Course course) {
		// Business rulss
		if (new CourseValidator().validCourseName(new ArrayList<>(), course.getCourseName())) {
			if (new CourseValidator().validPrice(course.getCoursePrice())) {
				if (courseDao.add(course)) {
					System.out.println("Kurs başarıyla kaydedildi. " + course.getCourseName());
					return true;
				} else {
					System.out.println("Veritabanına kaydedilemedi. Hata oluştu. " + course.getCourseName());
					return false;
				}
			} else {
				System.out.println("Geçersiz ücret. Kurs ücreti 0₺ den az olamaz... " + course.getCoursePrice());
				return false;
			}
		} else {
			System.out.println("Geçersiz kurs adı. Bu isimde kurs bulunmaktadır. " + course.getCourseName());
			return false;
		}
	}

	@Override
	public boolean update(int courseId) {
		// Business rulls
		if (courseDao.update(courseId))
			return true;
		else
			return false;
	}

	@Override
	public boolean delete(int courseId) {
		// Business rulls
		if (courseDao.delete(courseId))
			return true;
		else
			return false;
	}

	@Override
	public Course getCourseById(int courseId) {
		// Business rulls
		return courseDao.getCourseById(courseId);
	}

	@Override
	public List<Course> getAllCourses() {
		// Business rulls
		return courseDao.getAllCourses();
	}

}
