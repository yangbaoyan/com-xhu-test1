package cn.shop.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Session;

public class MailUtil {
	/*
	 * @param to :�ռ���
	 * @param code :������
	 */
	
    public static void sendmail(String to,String code){
    	/*
    	 * 1.���һ��session����
    	 * 2.����һ�������ʼ��Ķ���message
    	 * 3.�����ʼ�transport
    	 */
    	Properties props=new Properties();
    	Session session=Session.getInstance(props, new Authenticator() {
    		
    		
		});
    }
}
