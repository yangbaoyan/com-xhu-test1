package cn.shop.user.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.shop.user.entity.User;

public class UserDao extends HibernateDaoSupport{
    public User findUserName(String username){
    	String hql="from User where username=?";
    	List<User> list=this.getHibernateTemplate().find(hql,username);
    	if(list!=null&&list.size()>0){
    		return list.get(0);
    	}else{
    		return null;
    	}
    }

	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	public User login(User user) {
		String hql="from User where username=? and password=?";
		List<User> list=this.getHibernateTemplate().find(hql,user.getUsername(),user.getPassword());
		if(list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	public List<User> test(){
		String hql="from User";
		List<User> list=this.getHibernateTemplate().find(hql);
		return list;
	}
	
	
	
}
