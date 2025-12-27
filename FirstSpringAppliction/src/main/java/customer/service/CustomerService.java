package customer.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.dao.CustomerDao;
import customer.model.Customer;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerDao dao;

    public void register(Customer customer) {
        dao.saveCustomer(customer);
    }
}

