package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.logger.Logger;
import kodlamaIO.dataAccess.InstructorDao;
import kodlamaIO.entities.Instructor;

public class InstructorManager implements InstructorService {
	private InstructorDao instructorDao;
	private List<Logger> loggers;
	
	public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	@Override
	public boolean add(Instructor instructor) {
		// Business rulls...
		
		if (instructorDao.add(instructor))
			return true;
		else
			return false;
	}

	@Override
	public boolean update(int instructorId) {
		// Business rulls...
		
		if (instructorDao.update(instructorId))
			return true;
		else
			return false;
	}

	@Override
	public boolean delete(int instructorId) {
		// Business rulls...
		
		if (instructorDao.delete(instructorId))
			return true;
		else
			return false;
	}

	@Override
	public Instructor getInstructorById(int instructorId) {
		return instructorDao.getInstructorById(instructorId);
	}

	@Override
	public List<Instructor> getAllInstructors() {
		return instructorDao.getAllInstructors();
	}
}
