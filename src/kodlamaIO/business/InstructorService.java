package kodlamaIO.business;

import java.util.List;

import kodlamaIO.entities.Instructor;

public interface InstructorService {
	public boolean add(Instructor instructor);
	public boolean update(int instructorId);
	public boolean delete(int instructorId);
	public Instructor getInstructorById(int instructorId);
	public List<Instructor> getAllInstructors();
}
