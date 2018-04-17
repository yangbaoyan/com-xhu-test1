package cn.shop.product.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.shop.product.entity.Product;
import cn.shop.util.PageHibernateCallback;

public class ProductDao extends HibernateDaoSupport{
    //查找热门商品
	public List<Product> findHot() {//分页降序查找
		// 使用离线条件查找
		DetachedCriteria criteria=DetachedCriteria.forClass(Product.class);
		//查询热门商品is_hot=1
		criteria.add(Restrictions.eq("is_hot", 1));
		//倒序排序输出desc
		criteria.addOrder(Order.desc("pdate"));
		//执行查询
		List<Product> list=this.getHibernateTemplate().findByCriteria(criteria,0,10);
		return list;
	}
    //查找最新商品
	public List<Product> findnew() {
		DetachedCriteria criteria=DetachedCriteria.forClass(Product.class);
		criteria.addOrder(Order.desc("pdate"));
		List<Product> nplist=this.getHibernateTemplate().findByCriteria(criteria,0,10);
		if(nplist.size()>0){
			return nplist;
		}else {
			return null;
		}
	}
	//根据id查找一级下二级商品
	public Product getProduct(Integer id) {
		return this.getHibernateTemplate().get(Product.class, id);
	}
	
	//根据一级cid查询二级下的所有的商品
	public int findByCid(Integer cid) {
		String hql="select count(*) from Product p where p.categorySecond.category.cid=?";
		//String hql="select count(*) from Product";
		//List<Long> list=this.getHibernateTemplate().find(hql);
		List<Long> list=this.getHibernateTemplate().find(hql, cid);
		if(list!=null && list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}
	//根据一级cid，每页限制商品的条数来查询二级下的商品cid,begin,limit
	public List<Product> findPro(Integer cid, int begin,int limit) {
		String hql="select p from Product p join p.categorySecond c join c.category cs where cs.cid=?";
		//调用工具包中的PageHibernateCallback类
		List<Product> list=this.getHibernateTemplate()
				.execute(new PageHibernateCallback<Product>(hql, new Object[]{cid}, begin, limit));
		return list;
	}

}
