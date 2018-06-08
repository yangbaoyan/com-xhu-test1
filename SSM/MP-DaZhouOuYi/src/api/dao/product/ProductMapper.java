package api.dao.product;

import java.util.List;

import api.entity.Product;
import api.entity.ProductProperty;

public interface ProductMapper {

	List<Product> getProductByCategoryId(Integer id);

}
