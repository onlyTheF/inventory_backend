package app.company.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import app.company.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long> {
	
	
}
