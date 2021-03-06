/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.bankingApp.persistance.domain.constants.AddressType;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "address")
@Data
public class Address extends Auditable implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5191001425670396020L;
	
	@Column(name = "building_num")
	private String buildingNum;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String Country;
	
	@Column(name = "zipcode", nullable = false)
	private String zipCode; //todo restrict to 5 digits
	
	@Column(name = "address_type")
	private AddressType addressType;
	
	private String userId;
	
	/**
	 * @return the buildingNum
	 */
	public String getBuildingNum() {
		return buildingNum;
	}
	/**
	 * @param buildingNum the buildingNum to set
	 */
	public void setBuildingNum(String buildingNum) {
		this.buildingNum = buildingNum;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		Country = country;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the addressType
	 */
	public AddressType getAddressType() {
		return addressType;
	}
	/**
	 * @param addressType the addressType to set
	 */
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [buildingNum=" + buildingNum + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", Country=" + Country + ", zipCode=" + zipCode + ", addressType=" + addressType + ", userId="
				+ userId + "]";
	}
}
