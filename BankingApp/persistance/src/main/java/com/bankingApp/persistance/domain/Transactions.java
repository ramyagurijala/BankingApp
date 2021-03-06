/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.bankingApp.persistance.domain.constants.TransactionType;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "transactions")
@Data
public class Transactions extends Auditable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6609815263954499654L;
	
	@Column(name = "from_accnt")
	private String frmAccount;
	
	@Column(name = "to_accnt")
	private String toAccount;
	
	@Column(name = "amount")
	private double amount; //todo restrict to 2 decimal points
	
	@Column(name = "transaction_type")
	private TransactionType transactionType;
	
	@Column(name = "user_id")
	private String userId;
	
	/**
	 * @return the frmAccount
	 */
	public String getFrmAccount() {
		return frmAccount;
	}
	/**
	 * @param frmAccount the frmAccount to set
	 */
	public void setFrmAccount(String frmAccount) {
		this.frmAccount = frmAccount;
	}
	/**
	 * @return the toAccount
	 */
	public String getToAccount() {
		return toAccount;
	}
	/**
	 * @param toAccount the toAccount to set
	 */
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the transactionType
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
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
		return "Transactions [frmAccount=" + frmAccount + ", toAccount=" + toAccount + ", amount=" + amount
				+ ", transactionType=" + transactionType + ", userId=" + userId + "]";
	}
}
