package com.xiangxue.ch3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *@author yanghh yanghh
 *
 *类说明：
 */
public class UseAtomicInt {
	
	static AtomicInteger ai = new AtomicInteger(10);
	
    public static void main(String[] args) {
    	System.out.println(ai.getAndIncrement());//10--->11
    	System.out.println(ai.incrementAndGet());//11--->12--->out
    	System.out.println(ai.get());
    }
}
