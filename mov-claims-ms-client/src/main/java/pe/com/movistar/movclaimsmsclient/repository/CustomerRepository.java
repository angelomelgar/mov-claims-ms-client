package pe.com.movistar.movclaimsmsclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.movistar.movclaimsmsclient.entity.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public Customer findByCustomerCode(Long customerCode);
}
