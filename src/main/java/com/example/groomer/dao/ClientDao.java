package com.example.groomer.dao;

import com.example.groomer.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientDao extends CrudRepository<Client, Integer> {
}
