package kodlamaIO.dataAccess;

import java.util.List;

import kodlamaIO.entities.Category;

public interface CategoryDao {
	public boolean add(Category category);
	public boolean update(int instructorId);
	public boolean delete(int instructorId);
	public Category getCategoryById(int instructorId);
	public List<Category> getAllCategories();
}
