package com.srit.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srit.company.model.User;

public interface UserRepositrory  extends JpaRepository<User, Long>{

}
