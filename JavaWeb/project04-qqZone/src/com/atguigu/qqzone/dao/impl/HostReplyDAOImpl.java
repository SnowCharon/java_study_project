package com.atguigu.qqzone.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.atguigu.qqzone.dao.HostReplyDAO;
import com.atguigu.qqzone.pojo.HostReply;

/**
 * @title: HostReplyDAOImpl
 * @Author 竹玄羽
 * @Date: 2022/9/5 14:02
 */
public class HostReplyDAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {

    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return load("SELECT * FROM t_host_reply WHERE reply = ?",replyId);
    }
}
