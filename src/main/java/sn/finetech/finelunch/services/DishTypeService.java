package sn.finetech.finelunch.services;

import sn.finetech.finelunch.models.DishType;

import java.util.List;

public interface DishTypeService {

    List<DishType> findByName(String name);
}
