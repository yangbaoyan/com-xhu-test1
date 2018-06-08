package api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import api.entity.Banner;
import api.entity.Category;
import api.entity.User;
import api.service.IndexService;
import api.service.UserService;

@Controller

public class IndexController {
      @Resource
      private UserService userService;
      @Resource
      private IndexService indexService;
      
	  @RequestMapping(value="/user",method=RequestMethod.GET)
	  @ResponseBody
      public User index(@RequestParam Integer id) {
		   User user=userService.getUserById(id);
		  System.out.println(user);
    	return user;  
      }
	  
	  @RequestMapping(value="/userlist")
	  @ResponseBody
      public List<User> userList() {
		  List<User> userlist=userService.getUserList();
    	return userlist;  
      }
	 //banner
	  @RequestMapping(value="/indexbanner")
	  @ResponseBody
	  public List<Banner> bannerList(){
		  List<Banner> list=indexService.bannerList();
		  return list;
	  }
	 //Category
	  @RequestMapping(value="/category")
	  @ResponseBody
	  public List<Category> getCategoryList(){
		  List<Category> list=indexService.getCategorys();
		  return list;
	  }
}
