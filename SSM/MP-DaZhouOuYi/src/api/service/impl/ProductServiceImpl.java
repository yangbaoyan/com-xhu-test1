package api.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import api.dao.image.ImageMapper;
import api.dao.product.ProductMapper;
import api.dao.productproperty.ProductPropertyMapper;
import api.entity.Image;
import api.entity.Product;
import api.entity.ProductProperty;
import api.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Resource
	private ProductMapper productMapper;
	@Resource
	private ImageMapper imageMapper;
	@Resource
	private ProductPropertyMapper productPropertyMapper;

	@Override
	public List<Product> getProductByCategoryId(Integer id) {
		List<Product>list=productMapper.getProductByCategoryId(id);
		return list;
	}

	@Override
	public List<ProductProperty> getProductPropertyByProductId(Integer id) {
       List<ProductProperty> list=productPropertyMapper.getProductPropertyByProductId(id);
		return list;
	}

	@Override
	public List<Image> getProductImgsByPropertyByProductId(Integer id) {
		List<Image> list=imageMapper.getProductImgsByPropertyByProductId(id);
		return list;
	}

}
