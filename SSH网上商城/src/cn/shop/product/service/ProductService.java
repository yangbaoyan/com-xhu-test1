package cn.shop.product.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.shop.product.dao.ProductDao;
import cn.shop.product.entity.Product;
import cn.shop.util.PageBean;

@Transactional//����������ƣ��Ϳ��Խ�����ɾ��...
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
//��ҳ���Ҷ����·������Ʒ
public PageBean<Product> findProList(Integer cid,Integer pageno) {//һ����Ʒid
	PageBean<Product> pgbean=new PageBean<Product>();
	//��ǰҳ��
	pgbean.setPageno(pageno);
	//ÿҳ����Ʒ������
	int limit=12;
	pgbean.setPagesize(limit);
	//����һ����Ʒ��ʼ
	int begin=0;
	begin=(pageno-1)*limit;
	//����Ʒ������
	int totalsize=0;
	totalsize=productDao.findByCid(cid);
	pgbean.setTotalsize(totalsize);
	//��ҳ��
	int totalpage=0;
	totalpage=(int) Math.ceil(totalsize/limit);
	pgbean.setTotalpage(totalpage);
	//����ҳ��ѯ����Ʒ
	List<Product> plist=productDao.findPro(cid,begin,limit);
	pgbean.setList(plist);
	return pgbean;
} 
}
