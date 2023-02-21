package com.atguigu.qqzone.dao;

import com.atguigu.qqzone.pojo.HostReply;

public interface HostReplyDAO {
    //通过replyId查询到主人回应
    HostReply getHostReplyByReplyId(Integer replyId);
}
