package app.company.inventory.services;

import org.springframework.http.ResponseEntity;

import app.company.inventory.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search();
}
