package app.company.inventory.response;

import java.util.List;

import app.company.inventory.model.Category;
import lombok.Data;

@Data
public class CategoryResponse {

	private List<Category> category;
	
}
