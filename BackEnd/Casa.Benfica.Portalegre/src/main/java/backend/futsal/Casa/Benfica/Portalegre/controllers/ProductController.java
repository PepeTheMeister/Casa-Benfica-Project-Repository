package backend.futsal.Casa.Benfica.Portalegre.controllers;


import backend.futsal.Casa.Benfica.Portalegre.dto.ProductDto;
import backend.futsal.Casa.Benfica.Portalegre.entities.Product;
import backend.futsal.Casa.Benfica.Portalegre.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    ProductService productService;

    ResponseEntity<Object> response;

    @PostMapping("/product")
    public ResponseEntity<Object> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<Object> getAllProducts(){
        List<Product> listProducts = productService.getAllProducts();

        if(listProducts.isEmpty()){
            response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            response = new ResponseEntity<>(listProducts, HttpStatus.OK);
        }

        return response;

    }

    @GetMapping("product/{id}")
    public ResponseEntity<Object> findPlayerById(@PathVariable long id){
        ProductDto productDto = productService.findProductById(id);

        if(productDto != null){
            response = new ResponseEntity<>(productDto, HttpStatus.OK);
        }
        else{
            response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return response;
    }

    @DeleteMapping("product/{id}")
    public ResponseEntity<Object> deleteProductById(@PathVariable long id){
        if(productService.deleteProductById(id)){
            response = new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return response;
    }

    @PutMapping("product")
    public ResponseEntity<Object> updateProduct(@RequestBody Product product){
        if(productService.updateProduct(product)){
            response = new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return response;
    }

}
