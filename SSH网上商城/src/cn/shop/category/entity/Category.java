package cn.shop.category.entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;

import cn.shop.categorysecond.entity.CategorySecond;

public class Category {
      private String cname;
      private int cid;
      private Set<CategorySecond> categorySeconds=new HashSet<CategorySecond>();
      
      
    /**
	 * @return the categorySeconds
	 */
	public Set<CategorySecond> getCategorySeconds() {
		return categorySeconds;
	}
	/**
	 * @param categorySeconds the categorySeconds to set
	 */
	public void setCategorySeconds(Set<CategorySecond> categorySeconds) {
		this.categorySeconds = categorySeconds;
	}
	public Category(){}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}
      
}
