package com.lxt.ms.workflow.model;

import java.util.Date;

public class Rule {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_rule.RULE_ID
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    private String ruleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_rule.RULE_CATEGORY
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    private String ruleCategory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_rule.NAME
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_rule.MEMO
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_rule.INSERT_TIME
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_rule.UPDATE_TIME
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_rule.USER_ID
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_rule.REGEX
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    private String regex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_rule.RULE_ID
     *
     * @return the value of lxt_rule.RULE_ID
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_rule.RULE_ID
     *
     * @param ruleId the value for lxt_rule.RULE_ID
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_rule.RULE_CATEGORY
     *
     * @return the value of lxt_rule.RULE_CATEGORY
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public String getRuleCategory() {
        return ruleCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_rule.RULE_CATEGORY
     *
     * @param ruleCategory the value for lxt_rule.RULE_CATEGORY
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public void setRuleCategory(String ruleCategory) {
        this.ruleCategory = ruleCategory == null ? null : ruleCategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_rule.NAME
     *
     * @return the value of lxt_rule.NAME
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_rule.NAME
     *
     * @param name the value for lxt_rule.NAME
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_rule.MEMO
     *
     * @return the value of lxt_rule.MEMO
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_rule.MEMO
     *
     * @param memo the value for lxt_rule.MEMO
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_rule.INSERT_TIME
     *
     * @return the value of lxt_rule.INSERT_TIME
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_rule.INSERT_TIME
     *
     * @param insertTime the value for lxt_rule.INSERT_TIME
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_rule.UPDATE_TIME
     *
     * @return the value of lxt_rule.UPDATE_TIME
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_rule.UPDATE_TIME
     *
     * @param updateTime the value for lxt_rule.UPDATE_TIME
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_rule.USER_ID
     *
     * @return the value of lxt_rule.USER_ID
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_rule.USER_ID
     *
     * @param userId the value for lxt_rule.USER_ID
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_rule.REGEX
     *
     * @return the value of lxt_rule.REGEX
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public String getRegex() {
        return regex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_rule.REGEX
     *
     * @param regex the value for lxt_rule.REGEX
     *
     * @mbggenerated Tue Feb 26 10:22:12 CST 2019
     */
    public void setRegex(String regex) {
        this.regex = regex == null ? null : regex.trim();
    }
}