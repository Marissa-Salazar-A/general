package com.classicmodels2.services;

import com.classicmodels2.models.Client;
import com.classicmodels2.repositories.ClientRepository;
import com.classicmodels2.repositories.ICRUD;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by autozoner on 1/20/2020. dara manejo a ClientRepository a la bd
 *
 */
@Service
public class ClientService implements ICRUD<Client>{

    ClientRepository repository;

    @Override
    public List<Client> findAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public Client getById(Integer id) throws Exception {
        return repository.findById(id).get();
    }

    @Override
    public void save(Client obj) {
        repository.save(obj);
    }

    @Override
    public void update(Client obj, Integer id) {
        obj.setId((id));
        repository.save(obj);
    }

    @Override
    public void deleteById(Client obj, Integer id) {
        repository.deleteById(id);
    }
}
