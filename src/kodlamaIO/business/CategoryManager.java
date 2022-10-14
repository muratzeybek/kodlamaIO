package kodlamaIO.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIO.core.logger.Logger;
import kodlamaIO.core.validator.CategoryValidator;
import kodlamaIO.dataAccess.CategoryDao;
import kodlamaIO.entities.Category;

public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;
	private List<Logger> loggers;

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	@Override
	public boolean add(Category category) {
		System.out.println(this.getClass());
		System.out.println(this.getClass().getSimpleName());
		// Business rulls
		// CategoryValidator categoryValidator = new CategoryValidator();
		// categoryValidator.validName(getAllCategories(), category.getCategoryName());
		if (new CategoryValidator().validName(new ArrayList<>() , category.getCategoryName())) {
			if (categoryDao.add(category)) {
				System.out.println("Kategori başarıyla kaydedildi... "+ category.getCategoryName());
				return true;
			} else {
				System.out.println("Veritabanına eklenemedi. Hata oluştu.");
				return false;
			}
			
			
		} else {
			System.out.println("Geçersiz kategori adı. Bu isimde kategori zaten mevcut."+ category.getCategoryName());
		}
		return false;
	}

	@Override
	public boolean update(int categoryId) {
		// Business rulls
		if (categoryDao.update(categoryId))
			return true;
		else
			return false;
	}

	@Override
	public boolean delete(int categoryId) {
		// Business rulls
		if (categoryDao.delete(categoryId))
			return true;
		else
			return false;
	}

	@Override
	public Category getCategoryById(int categoryId) {
		// Business rulls
		return categoryDao.getCategoryById(categoryId);
	}

	@Override
	public List<Category> getAllCategories() {
		// Business rulls
		return categoryDao.getAllCategories();
	}
}
