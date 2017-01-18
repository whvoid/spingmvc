package com.wanghao.springmvc.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Enroll implements Serializable{
    private Long id;
    private Long createAt;
    private Long updateAt;
    private String studentName;
    private String studentQq;
    private String joinTime;
    private String studentNumber;
    private String logLink;
    private String target;
    private String reference;
    public Enroll() {
	super();
    }
    public Enroll(Long id, Long createAt, Long updateAt, String studentName, String studentQq, String joinTime,
	    String studentNumber, String logLink, String target, String reference) {
	super();
	this.id = id;
	this.createAt = createAt;
	this.updateAt = updateAt;
	this.studentName = studentName;
	this.studentQq = studentQq;
	this.joinTime = joinTime;
	this.studentNumber = studentNumber;
	this.logLink = logLink;
	this.target = target;
	this.reference = reference;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }
    public Long getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentQq() {
        return studentQq;
    }
    public void setStudentQq(String studentQq) {
        this.studentQq = studentQq;
    }
    public String getJoinTime() {
        return joinTime;
    }
    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public String getLogLink() {
        return logLink;
    }
    public void setLogLink(String logLink) {
        this.logLink = logLink;
    }
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    @Override
    public String toString() {
	return "Enroll [id=" + id + ", createAt=" + createAt + ", updateAt="
		+ updateAt + ", studentName=" + studentName + ", studentQq="
		+ studentQq + ", joinTime=" + joinTime + ", studentNumber="
		+ studentNumber + ", logLink=" + logLink + ", target=" + target
		+ ", reference=" + reference + "]";
    }   
}
