package com.xiangxue.ch8b.service.question;

import com.xiangxue.ch8b.assist.SL_QuestionBank;

/**
 *@author yanghh yanghh
 *
 *类说明：调用单个题目的处理器对题目进行处理的服务实现
 */
public class SingleQstService {

    /**
     * 对题目进行处理
     * @param questionId 题目id
     * @return 题目解析后的文本
     */
    public static String makeQuestion(Integer questionId){
        return BaseQuestionProcessor.makeQuestion(questionId,
                SL_QuestionBank.getQuetion(questionId).getDetail());
    }

}
