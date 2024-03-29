package com.xiangxue.ch7.performance;


import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 *@author yanghh yanghh
 *
 *类说明：缩小锁的范围
 */
public class ReduceLock {
	
	private Map<String,String> matchMap = new HashMap<>();
	
	public synchronized boolean isMatch(String name,String regexp) {
		String key = "user."+name;
		String job = matchMap.get(key);
		if(job == null) {
			return false;
		}else {
			return Pattern.matches(regexp, job);//很耗费时间
		}
	}
	
	public  boolean isMatchReduce(String name,String regexp) {
		String key = "user."+name;
		String job ;
		synchronized(this) {
			job = matchMap.get(key);
		}
	
		if(job == null) {
			return false;
		}else {
			return Pattern.matches(regexp, job);
		}
	}
	
}
