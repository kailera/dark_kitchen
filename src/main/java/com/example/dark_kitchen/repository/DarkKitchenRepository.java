/**
 *Remember: This is a contract. The implementations force the class to set the methods here defined.
 * @author kailera
 */
package com.example.dark_kitchen.repository;

import com.example.dark_kitchen.models.DarkKitchen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DarkKitchenRepository extends JpaRepository<DarkKitchen, Long> {

    Optional<DarkKitchen> findByName(String name);

    List<DarkKitchen> findByPriceLessThan(double price);

    List<DarkKitchen> findByAreaBetween(double minArea, double maxArea);
    
    Page<DarkKitchen>findAll(Pageable pageable);
}
