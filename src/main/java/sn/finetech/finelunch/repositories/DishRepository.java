package sn.finetech.finelunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.finetech.finelunch.models.Dish;

import java.util.List;

public interface DishRepository extends JpaRepository<Dish, Long> {
    List<Dish> findByName(String name);
}
