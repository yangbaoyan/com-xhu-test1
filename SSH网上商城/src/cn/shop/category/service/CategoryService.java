package cn.shop.category.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.shop.category.dao.CategoryDao;
import cn.shop.category.entity.Category;
@Transactional//事务控制
public class CategoryService {
     private CategoryDao categoryDao;//注入CategoryDao
	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}
	public List<Category> findAll() {
		return categoryDao.findAll();
	}
     
}
