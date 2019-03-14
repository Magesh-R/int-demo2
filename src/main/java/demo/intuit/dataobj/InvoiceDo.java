package demo.intuit.dataobj;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import demo.intuit.model.Invoice;


/**
 * The persistent class for the invoice database table.
 * 
 */
@Entity
@Table(name="invoice")
public class InvoiceDo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private BigDecimal amount;

	@Column(name="client_name")
	private String clientName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cre_date")
	private Date creDate;

	@Column(name="ref_id")
	private String refId;

	private String status;

	public InvoiceDo() {
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
	
	@Transient
	public Invoice getModel() {
		  Invoice inv = new Invoice();
		  inv.setAmount(amount);
		  inv.setClientName(clientName);
		  inv.setCreDate(creDate);
		  inv.setId(id);
		  inv.setRefId(refId);
		  inv.setStatus(status.equals("1")? "PAID" : "UNPAID");
		  return inv;
	}
	
	@Transient
	public void setModel(Invoice inv) {
		  amount = inv.getAmount();
		  clientName = inv.getClientName();
		  creDate = inv.getCreDate();
		  // id = inv.getId();
		  refId = inv.getRefId();
		  status = "PAID".equals(inv.getStatus())?  "1" : "0";
	}

}