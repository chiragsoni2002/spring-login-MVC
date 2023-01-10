package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Registration;

@Repository
public interface AdminRepositry extends JpaRepository<Registration, Integer> {

	Registration findByUsername(String username);

}
