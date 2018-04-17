package cn.shop.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.shop.user.dao.UserDao;
import cn.shop.user.entity.User;
@Transactional//事务控制
public class UserService {
    private UserDao userDao;//dao层的注入
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
    public User findUserName(String username){
    	return userDao.findUserName(username);
    }
	public void save(User user) {
		String uuid=cn.shop.util.Util.getUUID();
		user.setState(0);//0代表没激活，1代表已激活
		user.setCode(uuid);
		userDao.save(user);
	}
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}
}
