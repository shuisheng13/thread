package com.xiangxue.ch8b.vo;

import java.util.concurrent.Future;


/**
 *@author yanghh yanghh
 *
 *类说明：生成题目时返回结果的定义
 */
public class TaskResultVo {
	
	private final String questionDetail;
	private final Future<QuestionInCacheVo> questionFuture;
	
	public TaskResultVo(String questionDetail) {
		this.questionDetail = questionDetail;
		this.questionFuture = null;
	}
	
	public TaskResultVo(Future<QuestionInCacheVo> questionFuture) {
		this.questionDetail = null;
		this.questionFuture = questionFuture;
	}
	
	public String getQuestionDetail() {
		return questionDetail;
	}
	public Future<QuestionInCacheVo> getQuestionFuture() {
		return questionFuture;
	}
	
	

}
