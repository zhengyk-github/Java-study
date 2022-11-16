package com.demo.modules.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @ClassName: Student
 * @Date: Created in 2022/11/14 14:32
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
@TableName("student")
public class Student {
    @TableField("student_id")
    private String studentId;
    @TableField("studentName")
    private String studentName;
    @TableField("studentPassword")
    private String studentPassword;
    @TableField("studentPhone")
    private String studentPhone;
    @TableField("studentCard")
    private String studentCard;
    @TableField("studentEmail")
    private String studentEmail;
    @TableField("studentSex")
    private String studentSex;
    @TableField("studentCity")
    private String studentCity;
    @TableField("studentLanguageID")
    private String studentLanguageID;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(String studentCard) {
        this.studentCard = studentCard;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentLanguageID() {
        return studentLanguageID;
    }

    public void setStudentLanguageID(String studentLanguageID) {
        this.studentLanguageID = studentLanguageID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentPassword='" + studentPassword + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentCard='" + studentCard + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentSex='" + studentSex + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", studentLanguageID='" + studentLanguageID + '\'' +
                '}';
    }
}
