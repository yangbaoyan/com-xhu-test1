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
	//ע��CategoryService
	private CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	//ע�������ƷProductservice
	private ProductService productService;
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}


	public String execute(){
	//����������Ʒ
  	  List<Category> list=categoryService.findAll();
  	  ActionContext.getContext().getSession().put("clist", list);
  	  
  	 //����������Ʒ 
  	  List<Product> plist=productService.findHot();
  	  //����ֵջ��
  	  ActionContext.getContext().getValueStack().set("plist", plist);
  	  
  	  
  	  //����������Ʒ
  	  List<Product> nplist=productService.findnew();
  	  //����ֵջ��
  	  ActionContext.getContext().getValueStack().set("nplist", nplist);
  	  
  	  
  	  return "index";
    }
	
}
