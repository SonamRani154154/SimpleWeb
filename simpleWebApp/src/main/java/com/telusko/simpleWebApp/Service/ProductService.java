package com.telusko.simpleWebApp.Service;

import com.telusko.simpleWebApp.Model.Products;
import com.telusko.simpleWebApp.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
   // List<Products> products= new ArrayList<>();

//List<Products> products1 =  new ArrayList<>(Arrays.asList(new Products(101,"Shorts",500),
//                              new Products (102, "jeans",700),
//        new Products( 103, " frock", 800)));

//    public ProductService(){
//        AddProducts();
//    }
    public List<Products> getProducts(){
return repo.findAll();
    }
//    public void AddProducts (Products prod){
//        return AddProducts(prod);
//    }


    public Products getProductsById(int prodId) {
return  repo.findById(prodId).orElse(new Products());
       //return products1.stream().filter(p->p.getProdId()==prodId).findFirst().orElse(new Products(100,"No item",000));

    }

    public void addProducts(Products proud) {
       // products1.add(proud);
    repo.save(proud);
    }

    public void updateProduct(Products proud) {
//        int index;
//         for(int i=0; i<products1.size();i++){
//             if(products1.get(i).getProdId()==proud.getProdId()){
//              index=i;
//              products1.set(index,proud);
//             }
//         }

        repo.save(proud);
    }

    public void DeleteProductsById(int prodId) {
//         int index=0;
//         for(int i=0; i<products1.size();i++){
//             if(products1.get(i).getProdId()==prodId){
//                 index=i;
//             }
//         }
//         products1.remove(index);
        repo.deleteById(prodId);

    }
}
