package ru.gb.mybatis.model;

import java.util.Date;

public class OrderStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_status.order_status_id
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    private String orderStatusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_status.update_at
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    private Date updateAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_status.sale_id
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    private String saleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_status.status_name_id
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    private Integer statusNameId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_status.order_status_id
     *
     * @return the value of order_status.order_status_id
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    public String getOrderStatusId() {
        return orderStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_status.order_status_id
     *
     * @param orderStatusId the value for order_status.order_status_id
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId == null ? null : orderStatusId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_status.update_at
     *
     * @return the value of order_status.update_at
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_status.update_at
     *
     * @param updateAt the value for order_status.update_at
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_status.sale_id
     *
     * @return the value of order_status.sale_id
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_status.sale_id
     *
     * @param saleId the value for order_status.sale_id
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    public void setSaleId(String saleId) {
        this.saleId = saleId == null ? null : saleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_status.status_name_id
     *
     * @return the value of order_status.status_name_id
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    public Integer getStatusNameId() {
        return statusNameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_status.status_name_id
     *
     * @param statusNameId the value for order_status.status_name_id
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    public void setStatusNameId(Integer statusNameId) {
        this.statusNameId = statusNameId;
    }
}