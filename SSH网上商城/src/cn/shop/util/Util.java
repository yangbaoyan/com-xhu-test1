package cn.shop.util;

import java.util.UUID;


public class Util {
	/*
	 * �������һ���ַ���
	 */
     public static String getUUID(){
    	 return UUID.randomUUID().toString().replace("-", "");
     }
}
