package pe.com.movistar.movclaimsmsclient.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private Long productCode;
    private String productName;
    private String technology;
}
