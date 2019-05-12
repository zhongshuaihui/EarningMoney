package com.example.asus.earingmoney;

import java.util.ArrayList;

public class User {
    private int id;
    private int userType;//判断是普通用户还是管理员
    private String name;
    private String avator;//头像
    private String nickName;//昵称
    private int age;
    private int sex;
    private int grade;
    private String major;
    private String mailAddr;
    private String phoneNum;
    private String creditValue;//学号
    private int balance;//余额
    private ArrayList<String> tags;//标签，用于分类
    private String password;

    public User(int _id, int _userType, String _name, String _avator, String _nickName, int _age, int _sex, int _grade, String _major, String _mailAddr, String _phoneNum, String _creditValue, int _balance, ArrayList<String> _tags, String _password) {
        id = _id;
        userType = _userType;
        name = _name;
        avator = _avator;
        nickName = _nickName;
        age = _age;
        sex = _sex;
        grade = _grade;
        major = _major;
        mailAddr = _mailAddr;
        phoneNum = _phoneNum;
        creditValue = _creditValue;
        balance = _balance;
        tags = _tags;
        password = _password;
    }

    public int getId() {
        return id;
    }

    public int getUserType() {
        return userType;
    }

    public String getName() {
        return name;
    }

    public String getAvator() {
        return avator;
    }

    public String getNickName() {
        return nickName;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public int getGrade() {
        return grade;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public int getBalance() {
        return balance;
    }

    public String getCreditValue() {
        return creditValue;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public String getMajor() {
        return major;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreditValue(String creditValue) {
        this.creditValue = creditValue;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
