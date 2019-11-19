package com.lti.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_REG")
public class StudentReg {

	@Id
	@GeneratedValue
	
	@Column(name="STUDENT_ID")
	private int studentId;
	
	@Column(name="STUDENT_NAME")
	private String studentName;
	
	@Column(name="STUDENT_DOB")
	private LocalDate studentDOB;
	
	@Column(name="STUDENT_GENDER")
	private String studentGender;
	
	@Column(name="STUDENT_MOBILE_NO")
	private int studentMobileNo;
	
	@Column(name="STUDENT_EMAIL")
	private String studentEmail;
	
	@Column(name="INSTITUTE_CODE")
	private int instituteCode;
	
	@Column(name="STUDENT_AADHAR_NO")
	private int studentaadhar;
	
	@Column(name="STUDENT_PASSWORD")
	private String studentPassword;
	
	@Column(name="STUDENT_STATE")
	private String studentState;
	
	@Column(name="STUDENT_DISTRICT")
	private String studentDistrict;

	@ManyToOne
	@JoinColumn(name="INSTITUTE_CODE")
	private Institute institute;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public LocalDate getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(LocalDate studentDOB) {
		this.studentDOB = studentDOB;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public int getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(int studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public int getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}

	public int getStudentaadhar() {
		return studentaadhar;
	}

	public void setStudentaadhar(int studentaadhar) {
		this.studentaadhar = studentaadhar;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	
	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public String getStudentDistrict() {
		return studentDistrict;
	}

	public void setStudentDistrict(String studentDistrict) {
		this.studentDistrict = studentDistrict;
	}

}
