package in.Nimap.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Nimap.main.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
