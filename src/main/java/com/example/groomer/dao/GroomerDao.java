package com.example.groomer.dao;

import com.example.groomer.model.Groomer;
import org.springframework.data.repository.CrudRepository;

public interface GroomerDao extends CrudRepository<Groomer, Integer> {
}
