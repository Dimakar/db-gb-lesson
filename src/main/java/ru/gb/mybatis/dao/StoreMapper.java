package ru.gb.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ru.gb.mybatis.model.Store;
import ru.gb.mybatis.model.StoreExample;

public interface StoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    long countByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByPrimaryKey(Integer storeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insert(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insertSelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    List<Store> selectByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    Store selectByPrimaryKey(Integer storeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKeySelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKey(Store record);
}