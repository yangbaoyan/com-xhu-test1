package cn.shop.categorysecond.entity;

import java.util.HashSet;
import java.util.Set;

import cn.shop.category.entity.Category;
import cn.shop.product.entity.Product;

public class CategorySecond {
      private Integer csid;
      private String csname;
      private Category category;
      private Set<Product> products=new HashSet<Product>();
      
	/**
	 * @return the products
	 */
	public Set<Product> getProducts() {
		return products;
	}
	/**
	 * @param products the products to set
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	/**
	 * @return the csid
	 */
	public Integer getCsid() {
		return csid;
	}
	/**
	 * @param csid the csid to set
	 */
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
	/**
	 * @return the csname
	 */
	public String getCsname() {
		return csname;
	}
	/**
	 * @param csname the csname to set
	 */
	public void setCsname(String csname) {
		this.csname = csname;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
      
}
