package demo.intuit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import demo.intuit.service.TransactionService;

@Controller()
public class TransactionWebAppController {
	
	
	
	@Autowired
	TransactionService transactionService;

	
	@GetMapping("transactions/viewAll")
	public String viewAllTransactions(HttpServletRequest request) {
		request.setAttribute("allTransactions", transactionService.getAllUserTransactions());
		return "viewTransactions";
	}

}
