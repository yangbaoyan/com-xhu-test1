package cn.shop.test;

import java.util.List;

import cn.shop.user.dao.UserDao;
import cn.shop.user.entity.User;

public class Test {
	@org.junit.Test
       public void findAllUser(){
    	   UserDao user=new UserDao();
    	   List<User> list=user.test();
    	   System.out.println(list.size());
       }
}
