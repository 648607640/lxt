package com.lxt.ms.drools.mapper;

import com.lxt.ms.drools.model.Rule;
import com.lxt.ms.drools.model.RuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int countByExample(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int deleteByExample(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int insert(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int insertSelective(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    List<Rule> selectByExampleWithBLOBs(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    List<Rule> selectByExample(RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    Rule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int updateByExampleSelective(@Param("record") Rule record, @Param("example") RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Rule record, @Param("example") RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int updateByExample(@Param("record") Rule record, @Param("example") RuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int updateByPrimaryKeySelective(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Rule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_rule
     *
     * @mbggenerated Tue Mar 19 15:44:31 CST 2019
     */
    int updateByPrimaryKey(Rule record);
}