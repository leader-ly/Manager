package com.Manager.userManager.saaFactorField.dao;

import com.Manager.userManager.saaFactorField.po.SaaFactorField;
import java.util.List;

public interface SaaFactorFieldMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saa_factor_field
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saa_factor_field
     *
     * @mbggenerated
     */
    int insert(SaaFactorField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saa_factor_field
     *
     * @mbggenerated
     */
    SaaFactorField selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saa_factor_field
     *
     * @mbggenerated
     */
    List<SaaFactorField> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saa_factor_field
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SaaFactorField record);
}