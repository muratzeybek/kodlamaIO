package kodlamaIO.dataAccess;

import java.util.List;

import kodlamaIO.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public boolean add(Instructor instructor) {
		// JDBC Add Codes...
		return true;
	}

	@Override
	public boolean update(int instructorId) {
		// JDBC Update Codes...
		return true;
	}

	@Override
	public boolean delete(int instructorId) {
		// JDBC Delete Codes...
		return true;
	}

	@Override
	public Instructor getInstructorById(int instructorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Instructor> getAllInstructors() {
		// TODO Auto-generated method stub
		return null;
	}

}
