package cn.shop.util;

import java.util.UUID;


public class Util {
	/*
	 * 随机生成一个字符串
	 */
     public static String getUUID(){
    	 return UUID.randomUUID().toString().replace("-", "");
     }
}
