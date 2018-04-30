package com.yodlee.garage.block;

import java.io.Serializable;
/**
 * 
 * @author yodlee
 *
 */
public class BlockData implements Serializable{

	private static final long serialVersionUID = 1L;
	private String insuranceId;
	private String insuranceTerm;
	private String insuranceType;
	private Double premiumAmount;
	private String maturityDate;
	private String phoneNo;
	private String provider;
	/**
	 * @return the insuranceId
	 */
	public String getInsuranceId() {
		return insuranceId;
	}
	/**
	 * @param insuranceId the insuranceId to set
	 */
	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}
	/**
	 * @return the insuranceTerm
	 */
	public String getInsuranceTerm() {
		return insuranceTerm;
	}
	/**
	 * @param insuranceTerm the insuranceTerm to set
	 */
	public void setInsuranceTerm(String insuranceTerm) {
		this.insuranceTerm = insuranceTerm;
	}
	/**
	 * @return the insuranceType
	 */
	public String getInsuranceType() {
		return insuranceType;
	}
	/**
	 * @param insuranceType the insuranceType to set
	 */
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	/**
	 * @return the premiumAmount
	 */
	public Double getPremiumAmount() {
		return premiumAmount;
	}
	/**
	 * @param premiumAmount the premiumAmount to set
	 */
	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	/**
	 * @return the maturityDate
	 */
	public String getMaturityDate() {
		return maturityDate;
	}
	/**
	 * @param maturityDate the maturityDate to set
	 */
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}
	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BlockData [insuranceId=" + insuranceId + ", insuranceTerm="
				+ insuranceTerm + ", insuranceType=" + insuranceType
				+ ", premiumAmount=" + premiumAmount + ", maturityDate="
				+ maturityDate + ", phoneNo=" + phoneNo + ", provider="
				+ provider + "]";
	}
	
	/**
	 * 
	 */
	public BlockData(){}
	/**
	 * @param insuranceId
	 * @param insuranceTerm
	 * @param insuranceType
	 * @param premiumAmount
	 * @param maturityDate
	 * @param phoneNo
	 * @param provider
	 */
	public BlockData(String insuranceId, String insuranceTerm,
			String insuranceType, Double premiumAmount, String maturityDate,
			String phoneNo, String provider) {
		super();
		this.insuranceId = insuranceId;
		this.insuranceTerm = insuranceTerm;
		this.insuranceType = insuranceType;
		this.premiumAmount = premiumAmount;
		this.maturityDate = maturityDate;
		this.phoneNo = phoneNo;
		this.provider = provider;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((insuranceId == null) ? 0 : insuranceId.hashCode());
		result = prime * result
				+ ((insuranceTerm == null) ? 0 : insuranceTerm.hashCode());
		result = prime * result
				+ ((insuranceType == null) ? 0 : insuranceType.hashCode());
		result = prime * result
				+ ((maturityDate == null) ? 0 : maturityDate.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		result = prime * result
				+ ((premiumAmount == null) ? 0 : premiumAmount.hashCode());
		result = prime * result
				+ ((provider == null) ? 0 : provider.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlockData other = (BlockData) obj;
		if (insuranceId == null) {
			if (other.insuranceId != null)
				return false;
		} else if (!insuranceId.equals(other.insuranceId))
			return false;
		if (insuranceTerm == null) {
			if (other.insuranceTerm != null)
				return false;
		} else if (!insuranceTerm.equals(other.insuranceTerm))
			return false;
		if (insuranceType == null) {
			if (other.insuranceType != null)
				return false;
		} else if (!insuranceType.equals(other.insuranceType))
			return false;
		if (maturityDate == null) {
			if (other.maturityDate != null)
				return false;
		} else if (!maturityDate.equals(other.maturityDate))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		if (premiumAmount == null) {
			if (other.premiumAmount != null)
				return false;
		} else if (!premiumAmount.equals(other.premiumAmount))
			return false;
		if (provider == null) {
			if (other.provider != null)
				return false;
		} else if (!provider.equals(other.provider))
			return false;
		return true;
	}

	
}
