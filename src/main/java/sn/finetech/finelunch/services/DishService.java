package sn.finetech.finelunch.services;

import sn.finetech.finelunch.models.Dish;

import java.util.List;

public interface DishService {
    List<Dish> findByName(String name);
}
