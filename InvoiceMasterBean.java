package com.sp.beans;

import java.time.LocalDateTime;

public class InvoiceMasterBean {
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
	
	@Override
	public String toString() {
		return "InvoiceMasterBean [invoiceId=" + invoiceId + ", invoiceNo=" + invoiceNo + ", invoiceAmount="
				+ invoiceAmount + ", invoiceDate=" + invoiceDate + ", invoiceRemark=" + invoiceRemark + ", unitId="
				+ unitId + ", status=" + status + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", distName=" + distName + ", getInvoiceId()=" + getInvoiceId() + ", getInvoiceNo()=" + getInvoiceNo()
				+ ", getInvoiceAmount()=" + getInvoiceAmount() + ", getInvoiceDate()=" + getInvoiceDate()
				+ ", getInvoiceRemark()=" + getInvoiceRemark() + ", getUnitId()=" + getUnitId() + ", getStatus()="
				+ getStatus() + ", getCreatedDate()=" + getCreatedDate() + ", getUpdatedDate()=" + getUpdatedDate()
				+ ", getDistName()=" + getDistName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
