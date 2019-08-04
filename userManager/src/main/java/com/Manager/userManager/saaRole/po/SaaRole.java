package com.Manager.userManager.saaRole.po;

import java.io.Serializable;
import java.util.Date;

public class SaaRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.role_code
     *
     * @mbggenerated
     */
    private String roleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.role_c_name
     *
     * @mbggenerated
     */
    private String roleCName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.role_t_name
     *
     * @mbggenerated
     */
    private String roleTName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.role_e_name
     *
     * @mbggenerated
     */
    private String roleEName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.comcode
     *
     * @mbggenerated
     */
    private String comcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.creator_code
     *
     * @mbggenerated
     */
    private String creatorCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.updater_code
     *
     * @mbggenerated
     */
    private String updaterCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.valid_ind
     *
     * @mbggenerated
     */
    private String validInd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.flag
     *
     * @mbggenerated
     */
    private String flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.version
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.insert_time_for_his
     *
     * @mbggenerated
     */
    private Date insertTimeForHis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saa_role.operate_time_for_his
     *
     * @mbggenerated
     */
    private Date operateTimeForHis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table saa_role
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.role_code
     *
     * @return the value of saa_role.role_code
     *
     * @mbggenerated
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.role_code
     *
     * @param roleCode the value for saa_role.role_code
     *
     * @mbggenerated
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.role_c_name
     *
     * @return the value of saa_role.role_c_name
     *
     * @mbggenerated
     */
    public String getRoleCName() {
        return roleCName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.role_c_name
     *
     * @param roleCName the value for saa_role.role_c_name
     *
     * @mbggenerated
     */
    public void setRoleCName(String roleCName) {
        this.roleCName = roleCName == null ? null : roleCName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.role_t_name
     *
     * @return the value of saa_role.role_t_name
     *
     * @mbggenerated
     */
    public String getRoleTName() {
        return roleTName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.role_t_name
     *
     * @param roleTName the value for saa_role.role_t_name
     *
     * @mbggenerated
     */
    public void setRoleTName(String roleTName) {
        this.roleTName = roleTName == null ? null : roleTName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.role_e_name
     *
     * @return the value of saa_role.role_e_name
     *
     * @mbggenerated
     */
    public String getRoleEName() {
        return roleEName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.role_e_name
     *
     * @param roleEName the value for saa_role.role_e_name
     *
     * @mbggenerated
     */
    public void setRoleEName(String roleEName) {
        this.roleEName = roleEName == null ? null : roleEName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.comcode
     *
     * @return the value of saa_role.comcode
     *
     * @mbggenerated
     */
    public String getComcode() {
        return comcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.comcode
     *
     * @param comcode the value for saa_role.comcode
     *
     * @mbggenerated
     */
    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.creator_code
     *
     * @return the value of saa_role.creator_code
     *
     * @mbggenerated
     */
    public String getCreatorCode() {
        return creatorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.creator_code
     *
     * @param creatorCode the value for saa_role.creator_code
     *
     * @mbggenerated
     */
    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode == null ? null : creatorCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.create_time
     *
     * @return the value of saa_role.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.create_time
     *
     * @param createTime the value for saa_role.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.updater_code
     *
     * @return the value of saa_role.updater_code
     *
     * @mbggenerated
     */
    public String getUpdaterCode() {
        return updaterCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.updater_code
     *
     * @param updaterCode the value for saa_role.updater_code
     *
     * @mbggenerated
     */
    public void setUpdaterCode(String updaterCode) {
        this.updaterCode = updaterCode == null ? null : updaterCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.update_time
     *
     * @return the value of saa_role.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.update_time
     *
     * @param updateTime the value for saa_role.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.valid_ind
     *
     * @return the value of saa_role.valid_ind
     *
     * @mbggenerated
     */
    public String getValidInd() {
        return validInd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.valid_ind
     *
     * @param validInd the value for saa_role.valid_ind
     *
     * @mbggenerated
     */
    public void setValidInd(String validInd) {
        this.validInd = validInd == null ? null : validInd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.remark
     *
     * @return the value of saa_role.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.remark
     *
     * @param remark the value for saa_role.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.flag
     *
     * @return the value of saa_role.flag
     *
     * @mbggenerated
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.flag
     *
     * @param flag the value for saa_role.flag
     *
     * @mbggenerated
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.version
     *
     * @return the value of saa_role.version
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.version
     *
     * @param version the value for saa_role.version
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.insert_time_for_his
     *
     * @return the value of saa_role.insert_time_for_his
     *
     * @mbggenerated
     */
    public Date getInsertTimeForHis() {
        return insertTimeForHis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.insert_time_for_his
     *
     * @param insertTimeForHis the value for saa_role.insert_time_for_his
     *
     * @mbggenerated
     */
    public void setInsertTimeForHis(Date insertTimeForHis) {
        this.insertTimeForHis = insertTimeForHis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saa_role.operate_time_for_his
     *
     * @return the value of saa_role.operate_time_for_his
     *
     * @mbggenerated
     */
    public Date getOperateTimeForHis() {
        return operateTimeForHis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saa_role.operate_time_for_his
     *
     * @param operateTimeForHis the value for saa_role.operate_time_for_his
     *
     * @mbggenerated
     */
    public void setOperateTimeForHis(Date operateTimeForHis) {
        this.operateTimeForHis = operateTimeForHis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saa_role
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleCName=").append(roleCName);
        sb.append(", roleTName=").append(roleTName);
        sb.append(", roleEName=").append(roleEName);
        sb.append(", comcode=").append(comcode);
        sb.append(", creatorCode=").append(creatorCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", updaterCode=").append(updaterCode);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", validInd=").append(validInd);
        sb.append(", remark=").append(remark);
        sb.append(", flag=").append(flag);
        sb.append(", version=").append(version);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}