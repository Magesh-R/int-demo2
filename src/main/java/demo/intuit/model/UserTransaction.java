package demo.intuit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The model class for the user_transactions.
 * 
 */
public class UserTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private BigDecimal amount;

	private String refId;

	private Date transDate;

	public UserTransaction() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getRefId() {
		return this.refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public Date getTransDate() {
		if(this.transDate == null) {
			return new Date();
		}
		return this.transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

}