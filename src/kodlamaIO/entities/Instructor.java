package kodlamaIO.entities;

public class Instructor implements Entity {
	private int instructorId;
	private String instructorFirstName;
	private String instructorLastName;
	private String instructorPhotoUrl;

	public Instructor() {
	}
	
	public Instructor(int instructorId, String instructorFirstName, String instructorLastName,
			String instructorPhotoUrl) {
		this.instructorId = instructorId;
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
		this.instructorPhotoUrl = instructorPhotoUrl;
	}

	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorFirstName() {
		return instructorFirstName;
	}
	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}
	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}

	public String getInstructorPhotoUrl() {
		return instructorPhotoUrl;
	}
	public void setInstructorPhotoUrl(String instructorPhotoUrl) {
		this.instructorPhotoUrl = instructorPhotoUrl;
	}
}
