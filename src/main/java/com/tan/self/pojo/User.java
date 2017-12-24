package com.tan.self.pojo;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * Created by Mr.Tanzc on 2017/1/19.
 */

@TableName("sys_user")
public class User{

    private Integer id;
    private String loginName;
    private String password;
    private String name;
    private String no;
    private String phone;
    private String photo;
    private String remark;
    private String userType;
    private String email;
    private String loginFlag;
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", phone='" + phone + '\'' +
                ", photo='" + photo + '\'' +
                ", remark='" + remark + '\'' +
                ", userType='" + userType + '\'' +
                ", email='" + email + '\'' +
                ", loginFlag='" + loginFlag + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
