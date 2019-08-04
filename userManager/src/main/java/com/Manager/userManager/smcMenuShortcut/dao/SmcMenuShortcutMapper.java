package com.Manager.userManager.smcMenuShortcut.dao;

import com.Manager.userManager.smcMenuShortcut.po.SmcMenuShortcut;
import java.util.List;

public interface SmcMenuShortcutMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smc_menu_shortcut
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smc_menu_shortcut
     *
     * @mbggenerated
     */
    int insert(SmcMenuShortcut record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smc_menu_shortcut
     *
     * @mbggenerated
     */
    SmcMenuShortcut selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smc_menu_shortcut
     *
     * @mbggenerated
     */
    List<SmcMenuShortcut> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smc_menu_shortcut
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SmcMenuShortcut record);
}