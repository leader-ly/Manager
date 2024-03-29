package com.Manager.userManager.sysCompany.po;

import java.io.Serializable;
import java.util.Date;

public class SysCompany implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.com_code
     *
     * @mbggenerated
     */
    private String comCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.com_name
     *
     * @mbggenerated
     */
    private String comName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.upper_com_code
     *
     * @mbggenerated
     */
    private String upperComCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.com_path
     *
     * @mbggenerated
     */
    private String comPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.county
     *
     * @mbggenerated
     */
    private String county;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.org_type
     *
     * @mbggenerated
     */
    private String orgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.manager
     *
     * @mbggenerated
     */
    private String manager;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.audit_status
     *
     * @mbggenerated
     */
    private String auditStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.valid_status
     *
     * @mbggenerated
     */
    private String validStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.version
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.insert_time_for_his
     *
     * @mbggenerated
     */
    private Date insertTimeForHis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.operate_time_for_his
     *
     * @mbggenerated
     */
    private Date operateTimeForHis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.intro
     *
     * @mbggenerated
     */
    private String intro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_company.profile_picture
     *
     * @mbggenerated
     */
    private byte[] profilePicture;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_company
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.com_code
     *
     * @return the value of sys_company.com_code
     *
     * @mbggenerated
     */
    public String getComCode() {
        return comCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.com_code
     *
     * @param comCode the value for sys_company.com_code
     *
     * @mbggenerated
     */
    public void setComCode(String comCode) {
        this.comCode = comCode == null ? null : comCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.com_name
     *
     * @return the value of sys_company.com_name
     *
     * @mbggenerated
     */
    public String getComName() {
        return comName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.com_name
     *
     * @param comName the value for sys_company.com_name
     *
     * @mbggenerated
     */
    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.upper_com_code
     *
     * @return the value of sys_company.upper_com_code
     *
     * @mbggenerated
     */
    public String getUpperComCode() {
        return upperComCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.upper_com_code
     *
     * @param upperComCode the value for sys_company.upper_com_code
     *
     * @mbggenerated
     */
    public void setUpperComCode(String upperComCode) {
        this.upperComCode = upperComCode == null ? null : upperComCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.com_path
     *
     * @return the value of sys_company.com_path
     *
     * @mbggenerated
     */
    public String getComPath() {
        return comPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.com_path
     *
     * @param comPath the value for sys_company.com_path
     *
     * @mbggenerated
     */
    public void setComPath(String comPath) {
        this.comPath = comPath == null ? null : comPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.province
     *
     * @return the value of sys_company.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.province
     *
     * @param province the value for sys_company.province
     *
     * @mbggenerated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.city
     *
     * @return the value of sys_company.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.city
     *
     * @param city the value for sys_company.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.county
     *
     * @return the value of sys_company.county
     *
     * @mbggenerated
     */
    public String getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.county
     *
     * @param county the value for sys_company.county
     *
     * @mbggenerated
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.address
     *
     * @return the value of sys_company.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.address
     *
     * @param address the value for sys_company.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.org_type
     *
     * @return the value of sys_company.org_type
     *
     * @mbggenerated
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.org_type
     *
     * @param orgType the value for sys_company.org_type
     *
     * @mbggenerated
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.manager
     *
     * @return the value of sys_company.manager
     *
     * @mbggenerated
     */
    public String getManager() {
        return manager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.manager
     *
     * @param manager the value for sys_company.manager
     *
     * @mbggenerated
     */
    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.phone
     *
     * @return the value of sys_company.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.phone
     *
     * @param phone the value for sys_company.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.audit_status
     *
     * @return the value of sys_company.audit_status
     *
     * @mbggenerated
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.audit_status
     *
     * @param auditStatus the value for sys_company.audit_status
     *
     * @mbggenerated
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.valid_status
     *
     * @return the value of sys_company.valid_status
     *
     * @mbggenerated
     */
    public String getValidStatus() {
        return validStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.valid_status
     *
     * @param validStatus the value for sys_company.valid_status
     *
     * @mbggenerated
     */
    public void setValidStatus(String validStatus) {
        this.validStatus = validStatus == null ? null : validStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.version
     *
     * @return the value of sys_company.version
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.version
     *
     * @param version the value for sys_company.version
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.insert_time_for_his
     *
     * @return the value of sys_company.insert_time_for_his
     *
     * @mbggenerated
     */
    public Date getInsertTimeForHis() {
        return insertTimeForHis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.insert_time_for_his
     *
     * @param insertTimeForHis the value for sys_company.insert_time_for_his
     *
     * @mbggenerated
     */
    public void setInsertTimeForHis(Date insertTimeForHis) {
        this.insertTimeForHis = insertTimeForHis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.operate_time_for_his
     *
     * @return the value of sys_company.operate_time_for_his
     *
     * @mbggenerated
     */
    public Date getOperateTimeForHis() {
        return operateTimeForHis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.operate_time_for_his
     *
     * @param operateTimeForHis the value for sys_company.operate_time_for_his
     *
     * @mbggenerated
     */
    public void setOperateTimeForHis(Date operateTimeForHis) {
        this.operateTimeForHis = operateTimeForHis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.intro
     *
     * @return the value of sys_company.intro
     *
     * @mbggenerated
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.intro
     *
     * @param intro the value for sys_company.intro
     *
     * @mbggenerated
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_company.profile_picture
     *
     * @return the value of sys_company.profile_picture
     *
     * @mbggenerated
     */
    public byte[] getProfilePicture() {
        return profilePicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_company.profile_picture
     *
     * @param profilePicture the value for sys_company.profile_picture
     *
     * @mbggenerated
     */
    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", comCode=").append(comCode);
        sb.append(", comName=").append(comName);
        sb.append(", upperComCode=").append(upperComCode);
        sb.append(", comPath=").append(comPath);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", address=").append(address);
        sb.append(", orgType=").append(orgType);
        sb.append(", manager=").append(manager);
        sb.append(", phone=").append(phone);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", validStatus=").append(validStatus);
        sb.append(", version=").append(version);
        sb.append(", insertTimeForHis=").append(insertTimeForHis);
        sb.append(", operateTimeForHis=").append(operateTimeForHis);
        sb.append(", intro=").append(intro);
        sb.append(", profilePicture=").append(profilePicture);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}