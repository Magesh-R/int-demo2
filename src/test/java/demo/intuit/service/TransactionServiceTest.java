package demo.intuit.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import demo.intuit.dataobj.InvoiceDo;
import demo.intuit.model.UserTransaction;
import demo.intuit.repository.InvoiceRepository;
import demo.intuit.repository.TransactionRepository;

public class TransactionServiceTest {

	@Mock
	TransactionRepository mockTransactionRepository;

	@Mock
	InvoiceRepository mockInvoiceRepository;
	
	

	@Before
	public void setup() {
		List<InvoiceDo> mockInvoices = new ArrayList<>();
        Mockito.when(mockInvoiceRepository.findByRefId("123")).thenReturn(mockInvoices);
	}

	@Test
	public void testSaveTransaction() {

		BigDecimal a = new BigDecimal("12.00");
		Date edate = new Date(10000);
		UserTransaction u = makeUserTransaction(a, 1, "123", edate);
		TransactionService txnService = new TransactionService(mockTransactionRepository, mockInvoiceRepository);
		
		txnService.saveTransaction(u);
		
	}

	public UserTransaction makeUserTransaction(BigDecimal amount, int id, String refId, Date transDate) {
		UserTransaction u = new UserTransaction();
		u.setAmount(amount);
		u.setId(id);
		u.setRefId(refId);
		u.setTransDate(transDate);
		return u;

	}

}
