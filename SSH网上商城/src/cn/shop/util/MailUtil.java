package cn.shop.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Session;

public class MailUtil {
	/*
	 * @param to :收件人
	 * @param code :激活码
	 */
	
    public static void sendmail(String to,String code){
    	/*
    	 * 1.获得一个session对象
    	 * 2.创建一个代表邮件的对象message
    	 * 3.发送邮件transport
    	 */
    	Properties props=new Properties();
    	Session session=Session.getInstance(props, new Authenticator() {
    		
    		
		});
    }
}
