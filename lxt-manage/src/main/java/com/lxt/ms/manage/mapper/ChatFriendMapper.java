package com.lxt.ms.manage.mapper;

import com.lxt.ms.manage.model.ChatFriend;
import com.lxt.ms.manage.model.ChatFriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatFriendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    int countByExample(ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    int deleteByExample(ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    int insert(ChatFriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    int insertSelective(ChatFriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    List<ChatFriend> selectByExample(ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    ChatFriend selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    int updateByExampleSelective(@Param("record") ChatFriend record, @Param("example") ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    int updateByExample(@Param("record") ChatFriend record, @Param("example") ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    int updateByPrimaryKeySelective(ChatFriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Fri Feb 22 15:49:43 CST 2019
     */
    int updateByPrimaryKey(ChatFriend record);
}