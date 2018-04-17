package cn.shop.user.action;

import java.io.IOException;

import javax.mail.Session;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.shop.user.entity.User;
import cn.shop.user.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


//�õ�ģ�������������Զ���װ
public class UserAction extends ActionSupport implements ModelDriven<User>{
	
    private UserService userService;//service��ע��
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	private User user=new User();
	@Override
	public User getModel() {//ģ���������󶨽��ձ���װ���ݵĶ���(user)	
		return user;
	}
	
	
       public String registPage(){
    	   return "registpage";
       }
       
       //����ģ���������ձ����ύ����֤��(strut2�е������������ö�Ӧ��set~()���������ձ���������ֵ)
       private String checkimg;//ע��ʱ���յ���֤��
	   public void setCheckimg(String checkimg) {
		this.checkimg = checkimg;
	   }
	   private String captcha;//��¼ʱ���յ���֤��
	   public void setCaptcha(String captcha) {
		this.captcha = captcha;
	   }


	/*
        * �����û����Ƿ����
        */
       public String findByName() throws IOException{
    	  User existUser= userService.findUserName(user.getUsername());
    	  HttpServletResponse response=ServletActionContext.getResponse();
    	  response.setCharacterEncoding("utf-8");
    	  if(existUser!=null){
    		  response.getWriter().println("<font color='red'>�û�����ʹ�ã�</font>");
    	  }else{
    		  response.getWriter().println("<font>�û�������ʹ�ã�</font>");
    	  }
    	  return NONE;
       }
       
       /*
        * ע�ᣬ�ύ��
        */
       public String regist(){
    	   String checkString=ServletActionContext.getRequest()
    			   .getSession().getAttribute("checkcode").toString();
            if(!checkimg.equalsIgnoreCase(checkString)){
    		    this.addActionError("��֤�����!");
    		    return "checkimgerror";
    	   }else{
    		   userService.save(user);
        	   return SUCCESS; 
    	   }
    	   
       }
       
       
       
       
       /*
        * ��¼���ύ��
        */
       public String loginPage(){
    	   return "login";
       }
       public String login(){
    	   String checkcode=ServletActionContext.getRequest().getSession()
    			   .getAttribute("checkcode").toString();
    	   if(!checkcode.equalsIgnoreCase(captcha)){
    		   this.addActionError("��֤��������������룡");
    		   return "login";
    	   }else {
    		   User existuser= userService.login(user);
       	    if(existuser!=null){
       	    	ServletActionContext.getRequest().getSession()
       	    	.setAttribute("existuser", existuser);
       	    	return SUCCESS;
       	    }else{
       	    	this.addActionError("�û����������");
       	    	return "login";
       	    }
		}    
       }
    /*
     * �˳���¼
     */
       public String quit(){
    	   ServletActionContext.getRequest().getSession().invalidate();//����session�еļ�ֵ
    	   return "quit";
       }
}
