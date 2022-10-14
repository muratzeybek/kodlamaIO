package kodlamaIO.virtualDB;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.entities.Instructor;

public class InstructorsTable {
	
	public List<Instructor> getInstructors() {
		List<Instructor> instructors = new ArrayList<>();
			instructors.add(new Instructor(1, "Engin", "DEMİROĞ", "ed.jpg"));
			instructors.add(new Instructor(2, "Murat", "ZEYBEK", "mz.jpg"));
			instructors.add(new Instructor(3, "Muhammet", "ÇAYIRLI", "mc.jpg"));
			instructors.add(new Instructor(4, "Recep", "ÇOLAK", "rc.jpg"));
			return instructors;
	}
}
