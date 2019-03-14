package demo.intuit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.intuit.model.UserTransaction;
import demo.intuit.service.TransactionService;

@RestController()
public class TransactionRestController {
	
	
	@Autowired
	TransactionService txnService;
	
	
	
	@PostMapping("/transactionrest/save")
	public int saveTransaction(@RequestBody UserTransaction txn) {
		return txnService.saveTransaction(txn);
	}
	
	@GetMapping("/transactionrest")
	public List<UserTransaction> getAllTrans() {
		return txnService.getAllUserTransactions();
	}

}
