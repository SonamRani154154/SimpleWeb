package com.telusko.simpleWebApp.Controller;

import com.telusko.simpleWebApp.Model.Products;
import com.telusko.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired

    ProductService service;
    @GetMapping("/products")
     public List<Products> getProducts(){
         return service.getProducts() ;
     }
     @GetMapping("/Products/{prodId} ")
     public  Products getProductsById(@PathVariable int  prodId){
        return  service.getProductsById(prodId);
     }

     @PostMapping("/products")
     public void addProduct( @RequestBody Products proud){
         System.out.println(proud);
        service.addProducts(proud);
     }
     @PutMapping("/products")
      public void updateProduct(@RequestBody Products proud){
        service.updateProduct(proud);
      }

    @DeleteMapping("/products/{prodId}")
    public  void DeleteProductsById(@PathVariable int  prodId){

         service.DeleteProductsById(prodId);
    }
}
