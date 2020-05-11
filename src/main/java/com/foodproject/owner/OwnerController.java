package com.foodproject.owner;

import java.util.Optional;

import com.foodproject.restaurant.Restaurant;
import com.foodproject.restaurant.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Api(value = "Owner API", description= "Info about Owner entity")
public class OwnerController {

    @Autowired
    OwnerService service;

    @ApiOperation(value="Display all Owners",
            notes="Click here to get all owners from DB")
    @GetMapping("/owners")
    Iterable<Owner> getAllOwners()
    {
        return service.getAllOwners();
    }

    //
    @ApiOperation(value="Add a new owner",
            notes="Click here to add owner to DB")
    @PostMapping("/add/owner")
    String addOwner(@RequestBody Owner owner) {
        service.addOwner(owner);
        return owner.getFirstName()+" was added successfully.";
    }

    //
    @ApiOperation(value="Retrieve owner by ID",
            notes="Click here to get that owner details")
    @GetMapping("/get/ownerById/{ownerId}")
    Optional<Owner> getOwnerById(@PathVariable int ownerId) {
        return service.getOwnerById(ownerId);
    }

    //
    @ApiOperation(value="Update owner",
            notes="Click here to update owner details")
    @PostMapping("/update/owner")
    String updateOwner(@RequestBody Owner owner) {
        service.updateOwner(owner);
        return owner.getFirstName()+" was updated.";
    }

    //
    @ApiOperation(value="Remove owner",
            notes="Click here to remove owner details")
    @GetMapping("/remove/owner/{ownerId}")
    String removeOwner(@PathVariable int ownerId) {
        service.removeOwner(ownerId);
        return "Owner with ID " + ownerId + " was removed.";
    }

}
