package com.test.repository;

import com.test.entity.Customer;
import com.test.entity.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice,String> {

    List<Invoice> getInvoiceListByCustomers(Customer customer);
}
