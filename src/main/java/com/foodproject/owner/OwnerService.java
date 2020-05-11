package com.foodproject.owner;


import com.foodproject.restaurant.Restaurant;
import com.foodproject.restaurant.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository repo;

    Iterable<Owner> getAllOwners() {
        return repo.findAll();
    }

    void addOwner(Owner owner) {
        repo.save(owner);
    }

    Optional<Owner> getOwnerById(int ownerId) {
        return repo.findById(ownerId);
    }

    void updateOwner(Owner owner) {
        repo.save(owner);

    }

    void removeOwner(Integer ownerId) {

        repo.deleteById(ownerId);
    }

}
