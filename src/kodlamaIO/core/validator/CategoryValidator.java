package kodlamaIO.core.validator;

import java.util.List;

import kodlamaIO.entities.Category;
import kodlamaIO.virtualDB.CategoriesTable;

public class CategoryValidator implements Validator {

	public boolean validName(List<Category> categories, String name) {
		categories = new CategoriesTable().getCategories();
		for (Category category : categories) {
			if (category.getCategoryName().equals(name))
				return false;
		}
		return true;
	}
	
}
