package demo.intuit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demo.intuit.dataobj.InvoiceDo;

public interface InvoiceRepository extends CrudRepository<InvoiceDo, String> {

      public List<InvoiceDo> findByRefId(String refId);
}
