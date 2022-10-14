package kodlamaIO.virtualDB;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.entities.Category;

public class CategoriesTable {
	public List<Category> getCategories() {
		List<Category> categories = new ArrayList<>();
		categories.add(new Category(1, "Backend"));
		categories.add(new Category(2, "Frontend"));
		categories.add(new Category(3, "Assembly"));
		return categories;
	}
}
