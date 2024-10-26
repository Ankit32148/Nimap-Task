package in.Nimap.main.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import in.Nimap.main.Entity.Product;
import in.Nimap.main.Repository.ProductRepo;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepository;

    public Page<Product> getAllProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
    
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    
    public Product updateProduct(int id, Product productDetails) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("product not found"));
        product.setName(productDetails.getName());
        return productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
