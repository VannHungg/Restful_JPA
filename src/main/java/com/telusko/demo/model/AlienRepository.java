package com.telusko.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.support.DefaultCrudMethods;

public interface AlienRepository extends CrudRepository<Alien, Integer>{

}
