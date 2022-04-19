package ru.gb.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ru.gb.mybatis.model.Sale;
import ru.gb.mybatis.model.SaleExample;

public interface SaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    long countByExample(SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByExample(SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByPrimaryKey(String saleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insert(Sale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insertSelective(Sale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    List<Sale> selectByExample(SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    Sale selectByPrimaryKey(String saleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExampleSelective(@Param("record") Sale record, @Param("example") SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExample(@Param("record") Sale record, @Param("example") SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKeySelective(Sale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKey(Sale record);
}