package com.keepcoding.api.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.api.rest.entity.Producto;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Long>{

}
