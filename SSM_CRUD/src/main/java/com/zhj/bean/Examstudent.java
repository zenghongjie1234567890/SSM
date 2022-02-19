package com.zhj.bean;

public class Examstudent {
    private Integer flowid;

    private Integer type;

    private String idcard;

    private String examcard;

    private String studentname;

    private String location;

    private Integer grade;

    public Integer getFlowid() {
        return flowid;
    }

    public void setFlowid(Integer flowid) {
        this.flowid = flowid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getExamcard() {
        return examcard;
    }

    public void setExamcard(String examcard) {
        this.examcard = examcard == null ? null : examcard.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Examstudent(Integer flowid, Integer type, String idcard, String examcard, String studentname, String location, Integer grade) {
        this.flowid = flowid;
        this.type = type;
        this.idcard = idcard;
        this.examcard = examcard;
        this.studentname = studentname;
        this.location = location;
        this.grade = grade;
    }

    public Examstudent() {
    }

    @Override
    public String toString() {
        return "Examstudent{" +
                "flowid=" + flowid +
                ", type=" + type +
                ", idcard='" + idcard + '\'' +
                ", examcard='" + examcard + '\'' +
                ", studentname='" + studentname + '\'' +
                ", location='" + location + '\'' +
                ", grade=" + grade +
                '}';
    }
}