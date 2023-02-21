package com.atguigu.qqzone.service.impl;

import com.atguigu.qqzone.dao.ReplyDAO;
import com.atguigu.qqzone.pojo.HostReply;
import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;
import com.atguigu.qqzone.service.HostReplyService;
import com.atguigu.qqzone.service.ReplyService;

import java.util.List;

/**
 * @title: ReplyServiceImpl
 * @Author 竹玄羽
 * @Date: 2022/9/5 11:02
 */
public class ReplyServiceImpl implements ReplyService {
    private ReplyDAO replyDAO;

    //此处引用service层即业务层实现，而不是DAO层
    private HostReplyService hostReplyService;
    @Override
    public List<Reply> getReplyListByReplyId(Integer topicId) {
        List<Reply> replyList = replyDAO.getReplyList(new Topic(topicId));
        for (Reply reply : replyList) {
            HostReply hostReply = hostReplyService.getHostReplyByReplyId(reply.getId());
            reply.setHostReply(hostReply);
        }
        return replyList;
    }
}
