package org.spring.web_springproject.Controller;
import org.spring.web_springproject.Model.Product;
import org.spring.web_springproject.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    //Creating an element (C)
    @GetMapping("/products")
    public List<Product> getProduct() {

        return productService.showProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {

          return productService.getProductById(prodId);
    }
    //Reading the element from the user (R)
        @PostMapping("/products")
        public void addProduct(@RequestBody Product prod) {
            productService.addProduct(prod);
        }

    //Update the data (U)
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        productService.updateProduct(prod);
    }

    @DeleteMapping("/products/{prod}")
    public void deleteProduct(@PathVariable int prod) {
        productService.deleteProduct(prod);
    }
}
