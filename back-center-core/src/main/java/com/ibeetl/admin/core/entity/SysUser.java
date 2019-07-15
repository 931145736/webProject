package com.ibeetl.admin.core.entity;

import com.ibeetl.admin.core.util.ValidateConfig;
import org.beetl.sql.core.annotatoin.AutoID;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class SysUser {

    @NotNull(message = "ID不能为空", groups = ValidateConfig. UPDATE.class)
    @AutoID
    private Long userId;

    private String userName;

    private String password;
    private Date birthday;

    private String userImage;
    private String userBkImg;

    private Integer sex;

    private String autograph;
    private String address;

    private String email;

    private String phone;

    private Integer userType;

    private Integer userStatus;

    private Long createPin;

    private Date createTime;

    private Long updatePin;

    private Date updateTime;

    private Date ts;

    private Integer yn;

    private MultipartFile userImg;
    private MultipartFile userBkImage;
    /**
     * 用户关注的文集数
     */
    private Integer attentionNum;
    /**
     *组内角色
     */
    private String roleTypeStr;
    /**
     * 组内状态
     */
    private String userStatusStr;
    private Long groupId;

    /**
     * 是否有新用户关注
     */
    private Integer newFollow;

    public SysUser() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public String getUserBkImg() {
        return userBkImg;
    }

    public void setUserBkImg(String userBkImg) {
        this.userBkImg = userBkImg;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Long getCreatePin() {
        return createPin;
    }

    public void setCreatePin(Long createPin) {
        this.createPin = createPin;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdatePin() {
        return updatePin;
    }

    public void setUpdatePin(Long updatePin) {
        this.updatePin = updatePin;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public MultipartFile getUserImg() {
        return userImg;
    }

    public void setUserImg(MultipartFile userImg) {
        this.userImg = userImg;
    }

    public MultipartFile getUserBkImage() {
        return userBkImage;
    }

    public void setUserBkImage(MultipartFile userBkImage) {
        this.userBkImage = userBkImage;
    }

    public Integer getAttentionNum() {
        return attentionNum;
    }

    public void setAttentionNum(Integer attentionNum) {
        this.attentionNum = attentionNum;
    }

    public String getRoleTypeStr() {
        return roleTypeStr;
    }

    public void setRoleTypeStr(String roleTypeStr) {
        this.roleTypeStr = roleTypeStr;
    }

    public String getUserStatusStr() {
        return userStatusStr;
    }

    public void setUserStatusStr(String userStatusStr) {
        this.userStatusStr = userStatusStr;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Integer getNewFollow() {
        return newFollow;
    }

    public void setNewFollow(Integer newFollow) {
        this.newFollow = newFollow;
    }
}