package sn.finetech.finelunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.finetech.finelunch.models.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
