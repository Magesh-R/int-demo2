package demo.intuit.controller;

import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import demo.intuit.model.Invoice;
import demo.intuit.service.InvoiceService;

@Controller("/invoice")
public class InvoiceWebAppController {
	
	
	@Autowired
	InvoiceService invoiceService;

	
	
	@GetMapping("/viewAll")
	public String viewAllInvoices(HttpServletRequest request) {
		request.setAttribute("allInvoices", invoiceService.getAllInvoices());
		return "viewInvoices";
	}
	
	@PostMapping("/save")
	public String saveInvoice(HttpServletRequest request) {
		BigDecimal amount = new BigDecimal(request.getParameter("amount"));
		String clientName = request.getParameter("clientName");
		String refId = request.getParameter("refId");
		String status = request.getParameter("status");

		Invoice inv = new Invoice();
		inv.setAmount(amount);
		inv.setClientName(clientName);
		inv.setCreDate(new Date());
		inv.setRefId(refId);
		inv.setStatus(status);
		
		invoiceService.saveInvoice(inv);
		return "viewAllInvoices";
	}

}
