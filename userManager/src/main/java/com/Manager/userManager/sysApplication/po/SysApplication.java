package com.Manager.userManager.sysApplication.po;

import java.io.Serializable;
import java.util.Date;

public class SysApplication implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.system_code
     *
     * @mbggenerated
     */
    private String systemCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.cname
     *
     * @mbggenerated
     */
    private String cname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.ename
     *
     * @mbggenerated
     */
    private String ename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.home_Url
     *
     * @mbggenerated
     */
    private String homeUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.tech_architecture
     *
     * @mbggenerated
     */
    private String techArchitecture;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.developent_team
     *
     * @mbggenerated
     */
    private String developentTeam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.online_time
     *
     * @mbggenerated
     */
    private Date onlineTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.owner
     *
     * @mbggenerated
     */
    private String owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.backup_owner
     *
     * @mbggenerated
     */
    private String backupOwner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.database_name
     *
     * @mbggenerated
     */
    private String databaseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.database_type
     *
     * @mbggenerated
     */
    private String databaseType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.dbserver_path
     *
     * @mbggenerated
     */
    private String dbserverPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.svn_path
     *
     * @mbggenerated
     */
    private String svnPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.created_user
     *
     * @mbggenerated
     */
    private String createdUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.created_date
     *
     * @mbggenerated
     */
    private Date createdDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.updated_user
     *
     * @mbggenerated
     */
    private String updatedUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.updated_date
     *
     * @mbggenerated
     */
    private Date updatedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.validate_type
     *
     * @mbggenerated
     */
    private String validateType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.login_options
     *
     * @mbggenerated
     */
    private String loginOptions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.deleted_flag
     *
     * @mbggenerated
     */
    private byte[] deletedFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.add_role
     *
     * @mbggenerated
     */
    private byte[] addRole;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.role_auth
     *
     * @mbggenerated
     */
    private byte[] roleAuth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.res_auth
     *
     * @mbggenerated
     */
    private byte[] resAuth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.store_dept_auth
     *
     * @mbggenerated
     */
    private byte[] storeDeptAuth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.group_auth
     *
     * @mbggenerated
     */
    private byte[] groupAuth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.store_owner
     *
     * @mbggenerated
     */
    private byte[] storeOwner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_application.app_lock
     *
     * @mbggenerated
     */
    private byte[] appLock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_application
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.id
     *
     * @return the value of sys_application.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.id
     *
     * @param id the value for sys_application.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.system_code
     *
     * @return the value of sys_application.system_code
     *
     * @mbggenerated
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.system_code
     *
     * @param systemCode the value for sys_application.system_code
     *
     * @mbggenerated
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.cname
     *
     * @return the value of sys_application.cname
     *
     * @mbggenerated
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.cname
     *
     * @param cname the value for sys_application.cname
     *
     * @mbggenerated
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.ename
     *
     * @return the value of sys_application.ename
     *
     * @mbggenerated
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.ename
     *
     * @param ename the value for sys_application.ename
     *
     * @mbggenerated
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.description
     *
     * @return the value of sys_application.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.description
     *
     * @param description the value for sys_application.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.home_Url
     *
     * @return the value of sys_application.home_Url
     *
     * @mbggenerated
     */
    public String getHomeUrl() {
        return homeUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.home_Url
     *
     * @param homeUrl the value for sys_application.home_Url
     *
     * @mbggenerated
     */
    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl == null ? null : homeUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.tech_architecture
     *
     * @return the value of sys_application.tech_architecture
     *
     * @mbggenerated
     */
    public String getTechArchitecture() {
        return techArchitecture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.tech_architecture
     *
     * @param techArchitecture the value for sys_application.tech_architecture
     *
     * @mbggenerated
     */
    public void setTechArchitecture(String techArchitecture) {
        this.techArchitecture = techArchitecture == null ? null : techArchitecture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.developent_team
     *
     * @return the value of sys_application.developent_team
     *
     * @mbggenerated
     */
    public String getDevelopentTeam() {
        return developentTeam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.developent_team
     *
     * @param developentTeam the value for sys_application.developent_team
     *
     * @mbggenerated
     */
    public void setDevelopentTeam(String developentTeam) {
        this.developentTeam = developentTeam == null ? null : developentTeam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.online_time
     *
     * @return the value of sys_application.online_time
     *
     * @mbggenerated
     */
    public Date getOnlineTime() {
        return onlineTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.online_time
     *
     * @param onlineTime the value for sys_application.online_time
     *
     * @mbggenerated
     */
    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.owner
     *
     * @return the value of sys_application.owner
     *
     * @mbggenerated
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.owner
     *
     * @param owner the value for sys_application.owner
     *
     * @mbggenerated
     */
    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.backup_owner
     *
     * @return the value of sys_application.backup_owner
     *
     * @mbggenerated
     */
    public String getBackupOwner() {
        return backupOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.backup_owner
     *
     * @param backupOwner the value for sys_application.backup_owner
     *
     * @mbggenerated
     */
    public void setBackupOwner(String backupOwner) {
        this.backupOwner = backupOwner == null ? null : backupOwner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.database_name
     *
     * @return the value of sys_application.database_name
     *
     * @mbggenerated
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.database_name
     *
     * @param databaseName the value for sys_application.database_name
     *
     * @mbggenerated
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.database_type
     *
     * @return the value of sys_application.database_type
     *
     * @mbggenerated
     */
    public String getDatabaseType() {
        return databaseType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.database_type
     *
     * @param databaseType the value for sys_application.database_type
     *
     * @mbggenerated
     */
    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType == null ? null : databaseType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.dbserver_path
     *
     * @return the value of sys_application.dbserver_path
     *
     * @mbggenerated
     */
    public String getDbserverPath() {
        return dbserverPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.dbserver_path
     *
     * @param dbserverPath the value for sys_application.dbserver_path
     *
     * @mbggenerated
     */
    public void setDbserverPath(String dbserverPath) {
        this.dbserverPath = dbserverPath == null ? null : dbserverPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.svn_path
     *
     * @return the value of sys_application.svn_path
     *
     * @mbggenerated
     */
    public String getSvnPath() {
        return svnPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.svn_path
     *
     * @param svnPath the value for sys_application.svn_path
     *
     * @mbggenerated
     */
    public void setSvnPath(String svnPath) {
        this.svnPath = svnPath == null ? null : svnPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.created_user
     *
     * @return the value of sys_application.created_user
     *
     * @mbggenerated
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.created_user
     *
     * @param createdUser the value for sys_application.created_user
     *
     * @mbggenerated
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.created_date
     *
     * @return the value of sys_application.created_date
     *
     * @mbggenerated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.created_date
     *
     * @param createdDate the value for sys_application.created_date
     *
     * @mbggenerated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.updated_user
     *
     * @return the value of sys_application.updated_user
     *
     * @mbggenerated
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.updated_user
     *
     * @param updatedUser the value for sys_application.updated_user
     *
     * @mbggenerated
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser == null ? null : updatedUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.updated_date
     *
     * @return the value of sys_application.updated_date
     *
     * @mbggenerated
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.updated_date
     *
     * @param updatedDate the value for sys_application.updated_date
     *
     * @mbggenerated
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.validate_type
     *
     * @return the value of sys_application.validate_type
     *
     * @mbggenerated
     */
    public String getValidateType() {
        return validateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.validate_type
     *
     * @param validateType the value for sys_application.validate_type
     *
     * @mbggenerated
     */
    public void setValidateType(String validateType) {
        this.validateType = validateType == null ? null : validateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.login_options
     *
     * @return the value of sys_application.login_options
     *
     * @mbggenerated
     */
    public String getLoginOptions() {
        return loginOptions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.login_options
     *
     * @param loginOptions the value for sys_application.login_options
     *
     * @mbggenerated
     */
    public void setLoginOptions(String loginOptions) {
        this.loginOptions = loginOptions == null ? null : loginOptions.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.deleted_flag
     *
     * @return the value of sys_application.deleted_flag
     *
     * @mbggenerated
     */
    public byte[] getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.deleted_flag
     *
     * @param deletedFlag the value for sys_application.deleted_flag
     *
     * @mbggenerated
     */
    public void setDeletedFlag(byte[] deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.add_role
     *
     * @return the value of sys_application.add_role
     *
     * @mbggenerated
     */
    public byte[] getAddRole() {
        return addRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.add_role
     *
     * @param addRole the value for sys_application.add_role
     *
     * @mbggenerated
     */
    public void setAddRole(byte[] addRole) {
        this.addRole = addRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.role_auth
     *
     * @return the value of sys_application.role_auth
     *
     * @mbggenerated
     */
    public byte[] getRoleAuth() {
        return roleAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.role_auth
     *
     * @param roleAuth the value for sys_application.role_auth
     *
     * @mbggenerated
     */
    public void setRoleAuth(byte[] roleAuth) {
        this.roleAuth = roleAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.res_auth
     *
     * @return the value of sys_application.res_auth
     *
     * @mbggenerated
     */
    public byte[] getResAuth() {
        return resAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.res_auth
     *
     * @param resAuth the value for sys_application.res_auth
     *
     * @mbggenerated
     */
    public void setResAuth(byte[] resAuth) {
        this.resAuth = resAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.store_dept_auth
     *
     * @return the value of sys_application.store_dept_auth
     *
     * @mbggenerated
     */
    public byte[] getStoreDeptAuth() {
        return storeDeptAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.store_dept_auth
     *
     * @param storeDeptAuth the value for sys_application.store_dept_auth
     *
     * @mbggenerated
     */
    public void setStoreDeptAuth(byte[] storeDeptAuth) {
        this.storeDeptAuth = storeDeptAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.group_auth
     *
     * @return the value of sys_application.group_auth
     *
     * @mbggenerated
     */
    public byte[] getGroupAuth() {
        return groupAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.group_auth
     *
     * @param groupAuth the value for sys_application.group_auth
     *
     * @mbggenerated
     */
    public void setGroupAuth(byte[] groupAuth) {
        this.groupAuth = groupAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.store_owner
     *
     * @return the value of sys_application.store_owner
     *
     * @mbggenerated
     */
    public byte[] getStoreOwner() {
        return storeOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.store_owner
     *
     * @param storeOwner the value for sys_application.store_owner
     *
     * @mbggenerated
     */
    public void setStoreOwner(byte[] storeOwner) {
        this.storeOwner = storeOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_application.app_lock
     *
     * @return the value of sys_application.app_lock
     *
     * @mbggenerated
     */
    public byte[] getAppLock() {
        return appLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_application.app_lock
     *
     * @param appLock the value for sys_application.app_lock
     *
     * @mbggenerated
     */
    public void setAppLock(byte[] appLock) {
        this.appLock = appLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_application
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", systemCode=").append(systemCode);
        sb.append(", cname=").append(cname);
        sb.append(", ename=").append(ename);
        sb.append(", description=").append(description);
        sb.append(", homeUrl=").append(homeUrl);
        sb.append(", techArchitecture=").append(techArchitecture);
        sb.append(", developentTeam=").append(developentTeam);
        sb.append(", onlineTime=").append(onlineTime);
        sb.append(", owner=").append(owner);
        sb.append(", backupOwner=").append(backupOwner);
        sb.append(", databaseName=").append(databaseName);
        sb.append(", databaseType=").append(databaseType);
        sb.append(", dbserverPath=").append(dbserverPath);
        sb.append(", svnPath=").append(svnPath);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", updatedDate=").append(updatedDate);
        sb.append(", validateType=").append(validateType);
        sb.append(", loginOptions=").append(loginOptions);
        sb.append(", deletedFlag=").append(deletedFlag);
        sb.append(", addRole=").append(addRole);
        sb.append(", roleAuth=").append(roleAuth);
        sb.append(", resAuth=").append(resAuth);
        sb.append(", storeDeptAuth=").append(storeDeptAuth);
        sb.append(", groupAuth=").append(groupAuth);
        sb.append(", storeOwner=").append(storeOwner);
        sb.append(", appLock=").append(appLock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}