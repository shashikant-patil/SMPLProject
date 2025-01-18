package com.sp.beans;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import lombok.Data;
 
@Data
public class PatientDetailBean {
	 
	private Long patientId;
	private String fname;
	private String mname;
	private String lname;
	private String city;
	private Long pincode;
	private String address;
	private Integer age;	
	private Date dob;
	private Long mobileNo;
	private String gender;
	private Long adharNo;
 	private Long height;
	List<PatientDetailBean> patientbean;
 	private Long invoiceId;
	private Integer invoiceNo;
	private Double invoiceAmount;
	private LocalDateTime invoiceDate;
	private String invoiceRemark;
	private Integer unitId;
	private String status;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
	private String distName;
	private String patientNo;
	
	
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}
	public Long getHeight() {
		return height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}
	public Long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Integer getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Double getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(Double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public LocalDateTime getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDateTime invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceRemark() {
		return invoiceRemark;
	}
	public void setInvoiceRemark(String invoiceRemark) {
		this.invoiceRemark = invoiceRemark;
	}
	public Integer getUnitId() {
		return unitId;
	}
	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getDistName() {
		return distName;
	}
	public void setDistName(String distName) {
		this.distName = distName;
	}
	public String getPatientNo() {
		return patientNo;
	}
	public void setPatientNo(String patientNo) {
		this.patientNo = patientNo;
	}
	@Override
	public String toString() {
		return "PatientDetailBean [patientId=" + patientId + ", fname=" + fname + ", mname=" + mname + ", lname="
				+ lname + ", city=" + city + ", pincode=" + pincode + ", address=" + address + ", age=" + age + ", dob="
				+ dob + ", mobileNo=" + mobileNo + ", gender=" + gender + ", adharNo=" + adharNo + ", height=" + height
				+ ", invoiceId=" + invoiceId + ", invoiceNo=" + invoiceNo + ", invoiceAmount=" + invoiceAmount
				+ ", invoiceDate=" + invoiceDate + ", invoiceRemark=" + invoiceRemark + ", unitId=" + unitId
				+ ", status=" + status + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", distName="
				+ distName + ", patientNo=" + patientNo + ", getPatientId()=" + getPatientId() + ", getFname()="
				+ getFname() + ", getMname()=" + getMname() + ", getLname()=" + getLname() + ", getCity()=" + getCity()
				+ ", getPincode()=" + getPincode() + ", getAddress()=" + getAddress() + ", getAge()=" + getAge()
				+ ", getDob()=" + getDob() + ", getMobileNo()=" + getMobileNo() + ", getGender()=" + getGender()
				+ ", getAdharNo()=" + getAdharNo() + ", getHeight()=" + getHeight() + ", getInvoiceId()="
				+ getInvoiceId() + ", getInvoiceNo()=" + getInvoiceNo() + ", getInvoiceAmount()=" + getInvoiceAmount()
				+ ", getInvoiceDate()=" + getInvoiceDate() + ", getInvoiceRemark()=" + getInvoiceRemark()
				+ ", getUnitId()=" + getUnitId() + ", getStatus()=" + getStatus() + ", getCreatedDate()="
				+ getCreatedDate() + ", getUpdatedDate()=" + getUpdatedDate() + ", getDistName()=" + getDistName()
				+ ", getPatientNo()=" + getPatientNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
