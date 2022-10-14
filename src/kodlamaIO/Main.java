package kodlamaIO;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CategoryService;
import kodlamaIO.business.CourseManager;
import kodlamaIO.business.CourseService;
import kodlamaIO.core.logger.CloudLogger;
import kodlamaIO.core.logger.FileLogger;
import kodlamaIO.core.logger.Logger;
import kodlamaIO.core.validator.InstructorValidator;
import kodlamaIO.dataAccess.CategoryDao;
import kodlamaIO.dataAccess.HibernateCategoryDao;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.JdbcCategoryDao;
import kodlamaIO.dataAccess.JdbcCourseDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Instructor;
import kodlamaIO.virtualDB.InstructorsTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MyTests
		InstructorValidator instructorValidator = new InstructorValidator();

		// InstructorsTable().getInstructors();
		if (instructorValidator.ValidName(new ArrayList<>(), "Zahide"))
			System.out.println("Bu kişi adı uygun");
		else
			System.out.println("Bu kişi adı uygun deuldur da...");
		
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new FileLogger());
		loggers.add(new CloudLogger());
		
		//*****   *****
		List<Instructor> table = new InstructorsTable().getInstructors();
		for(Instructor ins:table)
		{
			System.out.println(ins.getInstructorFirstName() + " " + ins.getInstructorLastName());
		}
		
		//*************
		Category cat1 = new Category(4, "Frontenb");
		CategoryService categoryService = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryService.add(cat1);
		
		CategoryService categoryService2 = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryService2.add(new Category(5, "Assembly"));
		
		
		//************ COURSE ADD
		Course course1 = new Course(5, "ASP.NET", "Haydi ASP.NET'e", 3, 2, 99.99, null);
		CourseService courseService1 = new CourseManager(new HibernateCourseDao(), loggers);
		courseService1.add(course1);	

		Course course2 = new Course(5, "Arduino", "Arduinooo", 3, 2, 99.99, null);
		CourseService courseService2 = new CourseManager(new HibernateCourseDao(), loggers);
		courseService2.add(course2);	

		Course course3 = new Course(5, "Pascal", "Nostalji Programlama", 3, 2, -49.99, null);
		CourseService courseService3 = new CourseManager(new HibernateCourseDao(), loggers);
		courseService3.add(course3);	

		new FileLogger().log("deneme", 52);
	}
}
