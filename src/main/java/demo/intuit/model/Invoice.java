package demo.intuit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The model class for the invoice.
 * 
 */
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int id;

	private BigDecimal amount;

	private String clientName;

	private Date creDate;

	private String refId;

	private String status;

	public Invoice() {
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

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getCreDate() {
		return this.creDate;
	}

	public void setCreDate(Date creDate) {
		this.creDate = creDate;
	}

	public String getRefId() {
		return this.refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}