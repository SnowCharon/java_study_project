package com.atguigu.qqzone.service;

import com.atguigu.qqzone.pojo.Reply;

import java.util.List;

public interface ReplyService {
    //根据topic的id获取关联的所有回复
    List<Reply> getReplyListByReplyId(Integer topicId);
}
