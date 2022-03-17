package backend.futsal.Casa.Benfica.Portalegre.services;

import backend.futsal.Casa.Benfica.Portalegre.dto.ProductDto;
import backend.futsal.Casa.Benfica.Portalegre.entities.Product;
import backend.futsal.Casa.Benfica.Portalegre.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public void addProduct(Product product) {
        product.setLastModify(new Date(System.currentTimeMillis()));
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        List<Product> listAllProducts = new ArrayList<>();
        productRepository.findAll().forEach(listAllProducts::add);
        return listAllProducts;
    }

    public ProductDto findProductById(long id) {
        Optional<Product> optProduct = productRepository.findById(id);
        return optProduct.orElse(null) != null ? new ProductDto(optProduct.orElse(null)) : null;
    }

    public boolean deleteProductById(long id) {
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean updateProduct(Product product) {
        if(productRepository.existsById(product.getId())){
            product.setLastModify(new Date(System.currentTimeMillis()));
            productRepository.save(product);
            return true;
        }
        else{
            return false;
        }
    }
}
