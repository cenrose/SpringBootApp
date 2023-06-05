package ru.ksenia.spring2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ksenia.spring2.db.Product;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRep extends JpaRepository<Product, Long> {
    List<Product> findByType(String type);
    Optional<Product> findById (Long id);
}
