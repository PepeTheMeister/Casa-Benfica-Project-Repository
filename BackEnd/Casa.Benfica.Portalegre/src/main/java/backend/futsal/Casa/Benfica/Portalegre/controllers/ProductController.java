package backend.futsal.Casa.Benfica.Portalegre.controllers;


import backend.futsal.Casa.Benfica.Portalegre.entities.Product;
import backend.futsal.Casa.Benfica.Portalegre.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    ProductService productService;

    ResponseEntity<Object> response;

    @PostMapping("/add")
    public ResponseEntity<Object> addProduct(@RequestBody Product product){
        productService.addProduct(product);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
