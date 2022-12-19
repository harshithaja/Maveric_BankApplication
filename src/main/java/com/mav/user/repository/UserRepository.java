package com.mav.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.mav.user.entity.User;


public interface UserRepository extends CrudRepository<User, Integer>
{

}
