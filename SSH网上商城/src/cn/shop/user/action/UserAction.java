package cn.shop.user.action;

import java.io.IOException;

import javax.mail.Session;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.shop.user.entity.User;
import cn.shop.user.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


//用到模型驱动，进行自动封装
public class UserAction extends ActionSupport implements ModelDriven<User>{
	
    private UserService userService;//service的注入
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	private User user=new User();
	@Override
	public User getModel() {//模型驱动，绑定接收表单封装数据的对象(user)	
		return user;
	}
	
	
       public String registPage(){
    	   return "registpage";
       }
       
       //根据模型驱动接收表单里提交的验证码(strut2中的属性驱动，用对应的set~()方法来接收表单传过来的值)
       private String checkimg;//注册时接收的验证码
	   public void setCheckimg(String checkimg) {
		this.checkimg = checkimg;
	   }
	   private String captcha;//登录时接收的验证码
	   public void setCaptcha(String captcha) {
		this.captcha = captcha;
	   }


	/*
        * 检验用户名是否可用
        */
       public String findByName() throws IOException{
    	  User existUser= userService.findUserName(user.getUsername());
    	  HttpServletResponse response=ServletActionContext.getResponse();
    	  response.setCharacterEncoding("utf-8");
    	  if(existUser!=null){
    		  response.getWriter().println("<font color='red'>用户名已使用！</font>");
    	  }else{
    		  response.getWriter().println("<font>用户名可以使用！</font>");
    	  }
    	  return NONE;
       }
       
       /*
        * 注册，提交表单
        */
       public String regist(){
    	   String checkString=ServletActionContext.getRequest()
    			   .getSession().getAttribute("checkcode").toString();
            if(!checkimg.equalsIgnoreCase(checkString)){
    		    this.addActionError("验证码错误!");
    		    return "checkimgerror";
    	   }else{
    		   userService.save(user);
        	   return SUCCESS; 
    	   }
    	   
       }
       
       
       
       
       /*
        * 登录，提交表单
        */
       public String loginPage(){
    	   return "login";
       }
       public String login(){
    	   String checkcode=ServletActionContext.getRequest().getSession()
    			   .getAttribute("checkcode").toString();
    	   if(!checkcode.equalsIgnoreCase(captcha)){
    		   this.addActionError("验证码错误，请重新输入！");
    		   return "login";
    	   }else {
    		   User existuser= userService.login(user);
       	    if(existuser!=null){
       	    	ServletActionContext.getRequest().getSession()
       	    	.setAttribute("existuser", existuser);
       	    	return SUCCESS;
       	    }else{
       	    	this.addActionError("用户和密码错误！");
       	    	return "login";
       	    }
		}    
       }
    /*
     * 退出登录
     */
       public String quit(){
    	   ServletActionContext.getRequest().getSession().invalidate();//销毁session中的键值
    	   return "quit";
       }
}
