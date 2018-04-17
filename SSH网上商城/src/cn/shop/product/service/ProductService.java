package cn.shop.product.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.shop.product.dao.ProductDao;
import cn.shop.product.entity.Product;
import cn.shop.util.PageBean;

@Transactional//有了事务控制，就可以进行增删改...
public class ProductService {
   private ProductDao productDao;
public void setProductDao(ProductDao productDao) {
	this.productDao = productDao;
}
public List<Product> findHot() {
	// TODO Auto-generated method stub
	return productDao.findHot();
}
public List<Product> findnew() {
	// TODO Auto-generated method stub
	return productDao.findnew();
}

public Product getProduct(Integer id) {
	// TODO Auto-generated method stub
	return productDao.getProduct(id);
}
//分页查找二级下分类的商品
public PageBean<Product> findProList(Integer cid,Integer pageno) {//一级商品id
	PageBean<Product> pgbean=new PageBean<Product>();
	//当前页数
	pgbean.setPageno(pageno);
	//每页含商品的条数
	int limit=12;
	pgbean.setPagesize(limit);
	//从那一个商品开始
	int begin=0;
	begin=(pageno-1)*limit;
	//总商品的条数
	int totalsize=0;
	totalsize=productDao.findByCid(cid);
	pgbean.setTotalsize(totalsize);
	//总页数
	int totalpage=0;
	totalpage=(int) Math.ceil(totalsize/limit);
	pgbean.setTotalpage(totalpage);
	//按分页查询的商品
	List<Product> plist=productDao.findPro(cid,begin,limit);
	pgbean.setList(plist);
	return pgbean;
} 
}
