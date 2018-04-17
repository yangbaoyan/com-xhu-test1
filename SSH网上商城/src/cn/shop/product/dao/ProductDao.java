package cn.shop.product.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.shop.product.entity.Product;
import cn.shop.util.PageHibernateCallback;

public class ProductDao extends HibernateDaoSupport{
    //����������Ʒ
	public List<Product> findHot() {//��ҳ�������
		// ʹ��������������
		DetachedCriteria criteria=DetachedCriteria.forClass(Product.class);
		//��ѯ������Ʒis_hot=1
		criteria.add(Restrictions.eq("is_hot", 1));
		//�����������desc
		criteria.addOrder(Order.desc("pdate"));
		//ִ�в�ѯ
		List<Product> list=this.getHibernateTemplate().findByCriteria(criteria,0,10);
		return list;
	}
    //����������Ʒ
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
	//����id����һ���¶�����Ʒ
	public Product getProduct(Integer id) {
		return this.getHibernateTemplate().get(Product.class, id);
	}
	
	//����һ��cid��ѯ�����µ����е���Ʒ
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
	//����һ��cid��ÿҳ������Ʒ����������ѯ�����µ���Ʒcid,begin,limit
	public List<Product> findPro(Integer cid, int begin,int limit) {
		String hql="select p from Product p join p.categorySecond c join c.category cs where cs.cid=?";
		//���ù��߰��е�PageHibernateCallback��
		List<Product> list=this.getHibernateTemplate()
				.execute(new PageHibernateCallback<Product>(hql, new Object[]{cid}, begin, limit));
		return list;
	}

}
