package ru.gb.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ru.gb.mybatis.model.OrderStatus;
import ru.gb.mybatis.model.OrderStatusExample;

public interface OrderStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    long countByExample(OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByExample(OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByPrimaryKey(String orderStatusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insert(OrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insertSelective(OrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    List<OrderStatus> selectByExample(OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    OrderStatus selectByPrimaryKey(String orderStatusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExampleSelective(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExample(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKeySelective(OrderStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_status
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKey(OrderStatus record);
}