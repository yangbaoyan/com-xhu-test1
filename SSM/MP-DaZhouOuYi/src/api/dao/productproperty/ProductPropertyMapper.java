package api.dao.productproperty;

import java.util.List;

import api.entity.ProductProperty;

public interface ProductPropertyMapper {

	List<ProductProperty> getProductPropertyByProductId(Integer id);

}
	