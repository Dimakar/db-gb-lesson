package ru.gb.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ru.gb.mybatis.model.StatusName;
import ru.gb.mybatis.model.StatusNameExample;

public interface StatusNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    long countByExample(StatusNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByExample(StatusNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByPrimaryKey(Integer statusNameId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insert(StatusName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insertSelective(StatusName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    List<StatusName> selectByExample(StatusNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    StatusName selectByPrimaryKey(Integer statusNameId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExampleSelective(@Param("record") StatusName record, @Param("example") StatusNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExample(@Param("record") StatusName record, @Param("example") StatusNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKeySelective(StatusName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_name
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKey(StatusName record);
}