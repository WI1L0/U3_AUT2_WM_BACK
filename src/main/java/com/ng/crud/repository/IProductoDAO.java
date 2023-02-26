package com.ng.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ng.crud.model.productoDTO;

@Repository
public interface IProductoDAO extends MongoRepository<productoDTO, String>{

}
