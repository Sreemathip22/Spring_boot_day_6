package com.exersice.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exersice.day6.model.Child;

public interface Childrepo extends JpaRepository<Child,Integer>{

}
