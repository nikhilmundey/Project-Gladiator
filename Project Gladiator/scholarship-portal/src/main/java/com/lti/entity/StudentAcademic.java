package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="STUDENT_ACADEMIC")
public class StudentAcademic {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int academicId;
	
	@Column(name="INSTITUTE_NAME")
	private String institute_name;
	
	@Column(name="PRESENT_COURSE")
	private String present_course;
	
	@Column(name="PRESENT_COURSE_YEAR")
	private int present_course_year;
	
	@Column(name="MODE_OF_STUDY")
	private String mode_of_study;
	
	@Column(name="CLASS_START_DATE")
	private LocalDate class_start_date;
	
	@Column(name="UNIVERSITY_NAME")
	private String university_name;
	
	@Column(name="PREVIOUS_COURSE")
	private String previous_course;
	
	@Column(name="PREVIOUS_PASSING_YEAR")
	private int previous_passing_year;
	
	@Column(name="ROLL_NO_10")
	private String tenth_roll_no;
	
	@Column(name="BOARD_NAME_10")
	private String tenth_board_name;
	
	@Column(name="PASSING_YEAR_10")
	private int tenth_passing_year;
	
	@Column(name="MARKS_10")
	private int tenth_marks;
	
	@Column(name="ROLL_NO_12")
	private String twelth_roll_no;
	
	@Column(name="BOARD_NAME_12")
	private String twelth_board_name;

	@Column(name="PASSING_YEAR_12")
	private int twelth_passing_year;
	
	@Column(name="MARKS_12")
	private int twelth_marks;
	
	@Column(name="ADMISSION_FEE")
	private double admission_fee;
	
	@Column(name="TUTION_FEE")
	private double tution_fee;
	
	@Column(name="OTHER_FEE")
	private double other_fee;

	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentReg studentReg;
	
	public StudentReg getStudentReg() {
		return studentReg;
	}

	public void setStudentReg(StudentReg studentReg) {
		this.studentReg = studentReg;
	}

	public int getAcademicId() {
		return academicId;
	}

	public void setAcademicId(int academicId) {
		this.academicId = academicId;
	}

	public String getInstitute_name() {
		return institute_name;
	}

	public void setInstitute_name(String institute_name) {
		this.institute_name = institute_name;
	}

	public String getPresent_course() {
		return present_course;
	}

	public void setPresent_course(String present_course) {
		this.present_course = present_course;
	}

	public int getPresent_course_year() {
		return present_course_year;
	}

	public void setPresent_course_year(int present_course_year) {
		this.present_course_year = present_course_year;
	}

	public String getMode_of_study() {
		return mode_of_study;
	}

	public void setMode_of_study(String mode_of_study) {
		this.mode_of_study = mode_of_study;
	}

	public LocalDate getClass_start_date() {
		return class_start_date;
	}

	public void setClass_start_date(LocalDate class_start_date) {
		this.class_start_date = class_start_date;
	}

	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}

	public String getPrevious_course() {
		return previous_course;
	}

	public void setPrevious_course(String previous_course) {
		this.previous_course = previous_course;
	}

	public int getPrevious_passing_year() {
		return previous_passing_year;
	}

	public void setPrevious_passing_year(int previous_passing_year) {
		this.previous_passing_year = previous_passing_year;
	}

	public String getTenth_roll_no() {
		return tenth_roll_no;
	}

	public void setTenth_roll_no(String tenth_roll_no) {
		this.tenth_roll_no = tenth_roll_no;
	}

	public String getTenth_board_name() {
		return tenth_board_name;
	}

	public void setTenth_board_name(String tenth_board_name) {
		this.tenth_board_name = tenth_board_name;
	}

	public int getTenth_passing_year() {
		return tenth_passing_year;
	}

	public void setTenth_passing_year(int tenth_passing_year) {
		this.tenth_passing_year = tenth_passing_year;
	}

	public int getTenth_marks() {
		return tenth_marks;
	}

	public void setTenth_marks(int tenth_marks) {
		this.tenth_marks = tenth_marks;
	}

	public String getTwelth_roll_no() {
		return twelth_roll_no;
	}

	public void setTwelth_roll_no(String twelth_roll_no) {
		this.twelth_roll_no = twelth_roll_no;
	}

	public String getTwelth_board_name() {
		return twelth_board_name;
	}

	public void setTwelth_board_name(String twelth_board_name) {
		this.twelth_board_name = twelth_board_name;
	}

	public int getTwelth_passing_year() {
		return twelth_passing_year;
	}

	public void setTwelth_passing_year(int twelth_passing_year) {
		this.twelth_passing_year = twelth_passing_year;
	}

	public int getTwelth_marks() {
		return twelth_marks;
	}

	public void setTwelth_marks(int twelth_marks) {
		this.twelth_marks = twelth_marks;
	}

	public double getAdmission_fee() {
		return admission_fee;
	}

	public void setAdmission_fee(double admission_fee) {
		this.admission_fee = admission_fee;
	}

	public double getTution_fee() {
		return tution_fee;
	}

	public void setTution_fee(double tution_fee) {
		this.tution_fee = tution_fee;
	}

	public double getOther_fee() {
		return other_fee;
	}

	public void setOther_fee(double other_fee) {
		this.other_fee = other_fee;
	}	
}