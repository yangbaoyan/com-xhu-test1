package api.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import api.entity.Image;
import api.entity.Product;
import api.entity.ProductProperty;
import api.service.ProductService;

@Controller
public class ProductController {
    @Resource
    private ProductService productService;
	@RequestMapping(value="/product",method=RequestMethod.POST)
	@ResponseBody
	public List<Product> getProductByCategoryId(Integer id){
		List<Product> list=productService.getProductByCategoryId(id);
		return list;
	}
	
	@RequestMapping(value="/productproperty",method=RequestMethod.POST)
	@ResponseBody
	public List<ProductProperty> getProductPropertyByProductId(Integer id){
		List<ProductProperty> list=productService.getProductPropertyByProductId(id);
		return list;
	}
	
	@RequestMapping(value="/productimgs",method=RequestMethod.POST)
	@ResponseBody
	public List<Image> getProductImgsByPropertyByProductId(Integer id){
		List<Image> list=productService.getProductImgsByPropertyByProductId(id);
		return list;
	}
	
	
}
