package com.classicmodels2.repositories;

import com.classicmodels2.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by autozoner on 1/20/2020.
 */
public interface ClientRepository  extends JpaRepository<Client, Integer>{
}
