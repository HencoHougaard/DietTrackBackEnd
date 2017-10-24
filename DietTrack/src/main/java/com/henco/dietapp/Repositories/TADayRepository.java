package com.henco.dietapp.Repositories;

import com.henco.dietapp.Domain.TADay;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TADayRepository extends CrudRepository<TADay, String> {


}
