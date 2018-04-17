package cn.shop.index.action;

import java.util.List;

import org.junit.Test;

import cn.shop.category.entity.Category;
import cn.shop.category.service.CategoryService;
import cn.shop.product.entity.Product;
import cn.shop.product.service.ProductService;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	//注入CategoryService
	private CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	//注入二级商品Productservice
	private ProductService productService;
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}


	public String execute(){
	//查找所有商品
  	  List<Category> list=categoryService.findAll();
  	  ActionContext.getContext().getSession().put("clist", list);
  	  
  	 //查找热门商品 
  	  List<Product> plist=productService.findHot();
  	  //存入值栈中
  	  ActionContext.getContext().getValueStack().set("plist", plist);
  	  
  	  
  	  //查找最新商品
  	  List<Product> nplist=productService.findnew();
  	  //存入值栈中
  	  ActionContext.getContext().getValueStack().set("nplist", nplist);
  	  
  	  
  	  return "index";
    }
	
}
