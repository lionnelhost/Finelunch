package sn.finetech.finelunch.services.impl;

import org.springframework.stereotype.Service;
import sn.finetech.finelunch.models.Dish;
import sn.finetech.finelunch.repositories.DishRepository;
import sn.finetech.finelunch.services.DishService;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {

    DishRepository dishRepository;

    public DishServiceImpl(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public List<Dish> findByName(String name) {
        return dishRepository.findByName(name);
    }
}
