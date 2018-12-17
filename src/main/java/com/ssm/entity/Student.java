package com.ssm.entity;

import java.util.Date;

public class Student {
    private Integer id;

    private String studentId;

    private String studentName;

    private String className;

    private String englishName;

    private String loginName;

    private String loginPassword;

    private Integer sex;

    private String loginEmail;

    private Date birthday;

    private String address;

    private String fatherName;

    private String fatherTel;

    private Integer points;

    private String qqNum;

    private String wexinNum;

    private Integer grade;

    private String postNum;

    private String materName;

    private String materTel;

    private String identifyNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail == null ? null : loginEmail.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName == null ? null : fatherName.trim();
    }

    public String getFatherTel() {
        return fatherTel;
    }

    public void setFatherTel(String fatherTel) {
        this.fatherTel = fatherTel == null ? null : fatherTel.trim();
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum == null ? null : qqNum.trim();
    }

    public String getWexinNum() {
        return wexinNum;
    }

    public void setWexinNum(String wexinNum) {
        this.wexinNum = wexinNum == null ? null : wexinNum.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getPostNum() {
        return postNum;
    }

    public void setPostNum(String postNum) {
        this.postNum = postNum == null ? null : postNum.trim();
    }

    public String getMaterName() {
        return materName;
    }

    public void setMaterName(String materName) {
        this.materName = materName == null ? null : materName.trim();
    }

    public String getMaterTel() {
        return materTel;
    }

    public void setMaterTel(String materTel) {
        this.materTel = materTel == null ? null : materTel.trim();
    }

    public String getIdentifyNum() {
        return identifyNum;
    }

    public void setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum == null ? null : identifyNum.trim();
    }
}