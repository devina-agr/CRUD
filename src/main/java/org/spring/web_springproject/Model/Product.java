package org.spring.web_springproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public Product() {

    }

    public int getProdId() {

        return prodId;
    }

    public String getProdName()
    {
        return prodName;
    }
    public int getPrice() {

        return price;
    }

    public void setProdId(int prodId) {

        this.prodId = prodId;
    }
    public void setProdName(String prodName) {

        this.prodName = prodName;
    }
    public void setPrice(int price) {

        this.price = price;
    }
}
