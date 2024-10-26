package in.Nimap.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Nimap.main.Entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
