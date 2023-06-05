package ru.ksenia.spring2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ksenia.spring2.db.Product;
import ru.ksenia.spring2.repository.ProductRep;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/*это контроллер
в него попадают данные от пользователя */

@SpringBootApplication
@RestController
@RequestMapping()
public class RestAppApplication {
    private final ProductRep productRep;
    public RestAppApplication(ProductRep productRep) {
        this.productRep = productRep;
    }
    public static void main(String[] args) {
        SpringApplication.run(RestAppApplication.class, args);
    }

    /*просмотр всех существующих товаров по типу
    ссылка должна быть вида http://localhost:8080/products/laptops*/

    @GetMapping("/products/{type}")
    public List<Product> getProductsByType(@PathVariable String type) {
        switch (type) {
            case "desktopComputers":
                return productRep.findByType("desktopComputers");
            case "laptops":
                return productRep.findByType("laptops");
            case "monitors":
                return productRep.findByType("monitors");
            case "hardDisks":
                return productRep.findByType("hardDisks");
            default:
                return Collections.emptyList();
        }
    }

    /*просмотр всех существующих товаров по типу
    метод возвращает Optional<Product>
    использование этого класса способсвует безопасной обработке
    возможного отсутствия значения и снижает вероятность возникновения ошибок */

    //ссылка должна быть вида http://localhost:8080/product/1

    //прошу обратить внимание, что при поиске товара по ID /product используется в единственном числе

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> productOptional = productRep.findById(id);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            return ResponseEntity.ok(product);
        } else {
           return ResponseEntity.notFound().build();
       }
    }
}


