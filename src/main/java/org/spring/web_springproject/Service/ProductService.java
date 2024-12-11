package org.spring.web_springproject.Service;

import org.spring.web_springproject.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(new Product(101, "IPhone", 50000), new Product(102, "OnePlus", 60000), new Product(103, "MacBook", 100000)));

    public List<Product> showProducts(){

        return products;
    }

    public Product getProductById(int prodId){
            return products.stream()
                    .filter(p -> p.getProdId() == prodId)
                    .findFirst().orElse(new Product(000,"No Item Found",00000));

//        for(Product p:products){
//            if(p.getProdId()== prodId){
//                return p;
//            }
//        }
//        return null;
    }

    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index=0;
        for(int i=0;i<products.size();i++) {
            if (products.get(i).getProdId() == prod.getProdId())
                index = i;
        }
        products.set(index,prod);
        }

    public void deleteProduct(int prod) {
        int index=0;
        for(int i=0;i<products.size();i++) {
            if (products.get(i).getProdId() == prod)
                index = i;
        }
        products.remove(index);
    }
}

