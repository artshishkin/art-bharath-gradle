package net.shyshkin.study.gradle.migration.repos;

import net.shyshkin.study.gradle.migration.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
