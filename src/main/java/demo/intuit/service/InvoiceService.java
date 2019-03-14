package demo.intuit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.intuit.dataobj.InvoiceDo;
import demo.intuit.model.Invoice;
import demo.intuit.repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	InvoiceRepository invoiceRepository;

	public int saveInvoice(Invoice invModel) {
		InvoiceDo invoiceDo = new InvoiceDo();
		invoiceDo.setModel(invModel);
		return invoiceRepository.save(invoiceDo).getId();
	}
	
	public List<Invoice> getAllInvoices() {
		List<Invoice> txns = new ArrayList<Invoice>();	
		for(InvoiceDo c : invoiceRepository.findAll()) {
			txns.add(c.getModel());
		}
		return txns;
	}
		
	public Invoice getById(String courseId) {
		return invoiceRepository.findById(courseId).get().getModel();
	}
	
}
