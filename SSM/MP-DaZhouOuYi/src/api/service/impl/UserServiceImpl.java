package api.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import api.dao.user.UserMapper;
import api.entity.Banner;
import api.entity.User;
import api.service.UserService;
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    

	@Override
	public User getUserById(Integer id) {
		User user=userMapper.getUserById(id);
		System.out.println(user);
		System.out.println("hello word!");
		return user;
	}

	@Override
	public List<User> getUserList() {
		List<User> list=userMapper.getUserList();
		return list;
	}

  
     

}
