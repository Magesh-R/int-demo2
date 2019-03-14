package demo.intuit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.intuit.dataobj.InvoiceDo;
import demo.intuit.dataobj.UserTransactionDo;
import demo.intuit.model.UserTransaction;
import demo.intuit.repository.InvoiceRepository;
import demo.intuit.repository.TransactionRepository;

@Service
public class TransactionService {
	
	
	TransactionRepository transactionRepository;
	
	
	InvoiceRepository invoiceRepository;
	
	
	@Autowired
	public TransactionService(TransactionRepository txnr, InvoiceRepository invr) {
		this.transactionRepository = txnr;
		this.invoiceRepository = invr;
	}
	
	public int saveTransaction(UserTransaction txn) {
		
		List<InvoiceDo> invoiceForTxn = invoiceRepository.findByRefId(txn.getRefId());
	    if(invoiceForTxn != null && invoiceForTxn.size()>0) {
	    	InvoiceDo inv = invoiceForTxn.get(0);
	    	if(txn.getTransDate().compareTo(inv.getCreDate()) >  0) {
	    		if(inv.getAmount().equals(txn.getAmount())) {
	    			inv.setStatus("1");

	    			invoiceRepository.save(inv);
	    		}
	    		
	    	}
	    }
	    UserTransactionDo txnDo = new UserTransactionDo();
	    txnDo.setModel(txn);
		return transactionRepository.save(txnDo).getId();
	}
	
	public List<UserTransaction> getAllUserTransactions() {
		List<UserTransaction> txns = new ArrayList<UserTransaction>();	
		for(UserTransactionDo c : transactionRepository.findAll()) {
			txns.add(c.getModel());
		}
		return txns;
	}
	
	public UserTransaction getById(String courseId) {
		return transactionRepository.findById(courseId).get().getModel();
	}
	
	
	
}
