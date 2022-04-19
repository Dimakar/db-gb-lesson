package ru.gb.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ru.gb.mybatis.model.Country;
import ru.gb.mybatis.model.CountryExample;

public interface CountryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    long countByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int deleteByPrimaryKey(Integer countryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insert(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int insertSelective(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    List<Country> selectByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    Country selectByPrimaryKey(Integer countryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKeySelective(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbg.generated Tue Apr 19 21:43:39 MSK 2022
     */
    int updateByPrimaryKey(Country record);
}