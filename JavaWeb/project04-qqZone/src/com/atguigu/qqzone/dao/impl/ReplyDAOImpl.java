package com.atguigu.qqzone.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.atguigu.qqzone.dao.ReplyDAO;
import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;

import java.util.List;

/**
 * @title: ReplyDAOImpl
 * @Author 竹玄羽
 * @Date: 2022/9/5 14:03
 */
public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {
    @Override
    public List<Reply> getReplyList(Topic topic) {
        return super.executeQuery("SELECT * FROM t_reply WHERE topic = ?",topic.getId());
    }

    @Override
    public void addReply(Reply reply) {

    }

    @Override
    public void delReply(Integer id) {

    }
}
