package com.bdc.personalcashloan;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Auditors implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String names;

	private java.math.BigInteger loanAmount;

	private java.lang.String productCode;

	public Auditors() {
	}

	public java.lang.String getNames() {
		return this.names;
	}

	public void setNames(java.lang.String names) {
		this.names = names;
	}

	public java.math.BigInteger getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(java.math.BigInteger loanAmount) {
		this.loanAmount = loanAmount;
	}

	public java.lang.String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(java.lang.String productCode) {
		this.productCode = productCode;
	}

	public Auditors(java.lang.String names, java.math.BigInteger loanAmount,
			java.lang.String productCode) {
		this.names = names;
		this.loanAmount = loanAmount;
		this.productCode = productCode;
	}

}