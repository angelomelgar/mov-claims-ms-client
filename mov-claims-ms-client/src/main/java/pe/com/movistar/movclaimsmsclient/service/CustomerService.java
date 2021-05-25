package pe.com.movistar.movclaimsmsclient.service;

import pe.com.movistar.movclaimsmsclient.entity.Customer;

public interface CustomerService {
    public Customer getCustomer(Long customerCode);
    public Customer createCustomer(Customer customer);

}
