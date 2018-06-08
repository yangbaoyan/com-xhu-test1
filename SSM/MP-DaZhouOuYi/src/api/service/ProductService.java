package api.service;

import java.util.List;

import api.entity.Image;
import api.entity.Product;
import api.entity.ProductProperty;

public interface ProductService {

	List<Product> getProductByCategoryId(Integer id);

	List<Image> getProductImgsByPropertyByProductId(Integer id);

	List<ProductProperty> getProductPropertyByProductId(Integer id);


}
