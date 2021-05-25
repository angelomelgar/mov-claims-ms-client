package pe.com.movistar.movclaimsmsclient.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.com.movistar.movclaimsmsclient.model.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
@Table(name="tbl_customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerCode;

    private Long productCode;
    private String documentType;
    private String documentNumber;
    private String birthDate;

    @Transient
    private Product product;
}
