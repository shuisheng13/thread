package com.xiangxue.ch8b.assist;

/**
 *@author yanghh yanghh
 *
 *类说明：用sleep模拟实际的业务操作
 */
public class SL_Busi {

    public static void buisness(int sleepTime){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
