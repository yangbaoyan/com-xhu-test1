package cn.shop.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.shop.user.dao.UserDao;
import cn.shop.user.entity.User;
@Transactional//�������
public class UserService {
    private UserDao userDao;//dao���ע��
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
    public User findUserName(String username){
    	return userDao.findUserName(username);
    }
	public void save(User user) {
		String uuid=cn.shop.util.Util.getUUID();
		user.setState(0);//0����û���1�����Ѽ���
		user.setCode(uuid);
		userDao.save(user);
	}
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}
}
