package sn.finetech.finelunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.finetech.finelunch.models.DishType;

import java.util.List;

public interface DishTypeRepository extends JpaRepository<DishType, Long> {

    List<DishType> findByName(String name);

}
