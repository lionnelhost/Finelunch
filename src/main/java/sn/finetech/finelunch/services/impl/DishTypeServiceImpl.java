package sn.finetech.finelunch.services.impl;

import org.springframework.stereotype.Service;
import sn.finetech.finelunch.models.DishType;
import sn.finetech.finelunch.repositories.DishTypeRepository;
import sn.finetech.finelunch.services.DishTypeService;

import java.util.List;

@Service
public class DishTypeServiceImpl implements DishTypeService {

    DishTypeRepository dishTypeRepository;

    public DishTypeServiceImpl(DishTypeRepository dishTypeRepository) {
        this.dishTypeRepository = dishTypeRepository;
    }

    @Override
    public List<DishType> findByName(String name) {
        return dishTypeRepository.findByName(name);
    }
}
