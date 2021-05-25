package pe.com.movistar.movclaimsmsclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.com.movistar.movclaimsmsclient.model.Product;

@FeignClient(name ="mov-claims-ms-product", url="http://localhost:8091/" )
@RequestMapping(value ="/products")
public interface ProductClient {

    @GetMapping(value ="/{productCode}")
    public ResponseEntity<Product> getProduct(@PathVariable("productCode") Long productCode);
}
