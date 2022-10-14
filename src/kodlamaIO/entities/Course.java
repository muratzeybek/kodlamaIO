package kodlamaIO.entities;

public class Course implements Entity {
	private int courseId;
	private String courseName;
	private String courseDescription;
	private int courseCategoryId;
	private int courseInstructorId;
	private double coursePrice;
	private String courseImageUrl;
	
	public Course() {
	}

	public Course(int courseId, String courseName, String courseDescription, int courseCategoryId,
			int courseInstructorId, double coursePrice, String courseImageUrl) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseCategoryId = courseCategoryId;
		this.courseInstructorId = courseInstructorId;
		this.coursePrice = coursePrice;
		this.courseImageUrl = courseImageUrl;
	}

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getCourseCategoryId() {
		return courseCategoryId;
	}
	public void setCourseCategoryId(int courseCategoryId) {
		this.courseCategoryId = courseCategoryId;
	}

	public int getCourseInstructorId() {
		return courseInstructorId;
	}
	public void setCourseInstructorId(int courseInstructorId) {
		this.courseInstructorId = courseInstructorId;
	}

	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getCourseImageUrl() {
		return courseImageUrl;
	}
	public void setCourseImageUrl(String courseImageUrl) {
		this.courseImageUrl = courseImageUrl;
	}
}
