package demo.intuit.repository;

import org.springframework.data.repository.CrudRepository;

import demo.intuit.dataobj.UserTransactionDo;

public interface TransactionRepository extends CrudRepository<UserTransactionDo, String> {

}
