package kodlamaIO.business;

import java.util.List;

import kodlamaIO.entities.Category;

public interface CategoryService {
	public boolean add(Category category);
	public boolean update(int categoryId);
	public boolean delete(int categoryId);
	public Category getCategoryById(int categoryId);
	public List<Category> getAllCategories();
}
