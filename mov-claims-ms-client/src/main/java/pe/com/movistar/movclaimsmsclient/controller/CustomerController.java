package pe.com.movistar.movclaimsmsclient.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.com.movistar.movclaimsmsclient.entity.Customer;
import pe.com.movistar.movclaimsmsclient.service.CustomerService;

@Slf4j
@RestController
@RequestMapping(value ="/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value ="/{customerCode}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("customerCode") Long customerCode){
        Customer customer = customerService.getCustomer(customerCode);
        if(null==customer){
            log.error("Cliente no encontrado");
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(customer);
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer customerCreate = customerService.createCustomer(customer);
        log.info("Cliente creado");
        return ResponseEntity.status(HttpStatus.CREATED).body(customerCreate);
    }




}
