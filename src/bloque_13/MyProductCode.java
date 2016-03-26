package bloque_13;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author alonsocucei
 */
@Table(name="PRODUCT_CODE")
@Entity
public class MyProductCode implements Serializable {
     @Id
     @Column(name="PROD_CODE")
     private String prodCode;
     @Column(name="DISCOUNT_CODE")
     private char discountCode;
     @Column(name="DESCRIPTION")
     private String description;

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public char getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(char discountCode) {
        this.discountCode = discountCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyProductCode{" + "prodCode=" + prodCode + ", discountCode=" + discountCode + ", description=" + description + '}';
    }
    
    
}
