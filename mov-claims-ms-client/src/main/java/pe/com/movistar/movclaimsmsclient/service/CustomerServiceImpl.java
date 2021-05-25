package pe.com.movistar.movclaimsmsclient.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.movistar.movclaimsmsclient.client.ProductClient;
import pe.com.movistar.movclaimsmsclient.entity.Customer;
import pe.com.movistar.movclaimsmsclient.model.Product;
import pe.com.movistar.movclaimsmsclient.repository.CustomerRepository;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductClient productClient;

    @Override
    public Customer getCustomer(Long customerCode) {
        Customer customer = customerRepository.findByCustomerCode(customerCode);
        Product product = productClient.getProduct(customer.getProductCode()).getBody();
        customer.setProduct(product);
        return customer;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
