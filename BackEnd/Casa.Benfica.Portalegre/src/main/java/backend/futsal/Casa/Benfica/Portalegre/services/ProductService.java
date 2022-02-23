package backend.futsal.Casa.Benfica.Portalegre.services;

import backend.futsal.Casa.Benfica.Portalegre.entities.Product;
import backend.futsal.Casa.Benfica.Portalegre.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
