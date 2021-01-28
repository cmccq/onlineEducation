package com.onlineeducation.dao;

import com.onlineeducation.entity.User;
import com.onlineeducation.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @Entity com.onlineeducation.entity.User
 */
public interface UserDao {
    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    long countByExample(UserExample example);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    User selectByPrimaryKey(Integer userId);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2021-01-27 17:52:01
     */
    int updateByPrimaryKey(User record);
}