package cn.shop.category.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.shop.category.entity.Category;

public class CategoryDao extends HibernateDaoSupport {
	public List<Category> findAll() {
		String hql="from Category";
		List<Category> list=this.getHibernateTemplate().find(hql);
		if(list.size()>0){
		  return list;
		}else{
	      return null;
		}	
	}      
}
