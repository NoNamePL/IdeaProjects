package com.MySQL.rest_api_my_sql.service;

import com.MySQL.rest_api_my_sql.model.User;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by the Spring into a Bean called UserRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
