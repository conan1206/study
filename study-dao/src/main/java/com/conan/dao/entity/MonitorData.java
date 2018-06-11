package com.conan.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The type Monitor data.
 */

/**
 * @author
 */
public class MonitorData {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 指标编码
     */
    private String indexCode;

    /**
     * 维度
     */
    private String dimension;

    /**
     * 周期
     */
    private Integer period;

    /**
     * 时间字符串
     */
    private String timeString;

    /**
     * 取值
     */
    private BigDecimal value;

    /**
     * 创建用户
     */
    private String createdUser;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新用户
     */
    private String updatedUser;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * Gets id.
     *
     * @return the id
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets index code.
     *
     * @return the index code
     */
    public String getIndexCode() {
        return indexCode;
    }

    /**
     * Sets index code.
     *
     * @param indexCode the index code
     */
    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    /**
     * Gets dimension.
     *
     * @return the dimension
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * Sets dimension.
     *
     * @param dimension the dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * Gets period.
     *
     * @return the period
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets period.
     *
     * @param period the period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * Gets time string.
     *
     * @return the time string
     */
    public String getTimeString() {
        return timeString;
    }

    /**
     * Sets time string.
     *
     * @param timeString the time string
     */
    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets created user.
     *
     * @return the created user
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * Sets created user.
     *
     * @param createdUser the created user
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * Gets created.
     *
     * @return the created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Sets created.
     *
     * @param created the created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * Gets updated user.
     *
     * @return the updated user
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * Sets updated user.
     *
     * @param updatedUser the updated user
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * Gets updated.
     *
     * @return the updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * Sets updated.
     *
     * @param updated the updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}