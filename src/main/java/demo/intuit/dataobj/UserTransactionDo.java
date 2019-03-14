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

import demo.intuit.model.UserTransaction;


/**
 * The persistent class for the user_transactions database table.
 * 
 */
@Entity
@Table(name="user_transactions")
public class UserTransactionDo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private BigDecimal amount;

	@Column(name="ref_id")
	private String refId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="trans_date")
	private Date transDate;

	public UserTransactionDo() {
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
		return this.transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	
	@Transient
	public UserTransaction getModel() {
		  UserTransaction ut = new UserTransaction();
		  ut.setAmount(amount);
		  ut.setRefId(refId);
		  ut.setTransDate(transDate);
		  ut.setId(id);
		  return ut;
	}
	
	@Transient
	public void setModel(UserTransaction ut) {
		  amount = ut.getAmount();
		  refId = ut.getRefId();
		  if(ut.getTransDate() == null) {
			  transDate = new Date();
		  } else {
		  transDate = ut.getTransDate();
		  }
		  // id = inv.getId();
	}

}