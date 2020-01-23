package com.classicmodels2.repositories;

import java.util.List;

/**
 * Created by autozoner on 1/20/2020. NORMALIZAR PETICIONES
 * T es el tipo de dato, q en este caso seia la clase Client
 * protoripo de los metodos
 */
public interface ICRUD <T>{

    List<T> findAll() throws  Exception;
    T getById(Integer id) throws Exception;
    void save (T obj);
    void update(T obj, Integer id);
    void deleteById(T obj, Integer id);

}
