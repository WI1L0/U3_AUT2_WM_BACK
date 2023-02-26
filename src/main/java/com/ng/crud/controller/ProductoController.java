package com.ng.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ng.crud.model.productoDTO;
import com.ng.crud.repository.IProductoDAO;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/productos")
public class ProductoController {

	@Autowired
	private IProductoDAO repository;

	@PostMapping("/product")
	public productoDTO create(@Validated @RequestBody productoDTO p) {
		return repository.insert(p);
	}

	@GetMapping("/")
	public List<productoDTO> readAll() {
		return repository.findAll();
	}

	@PutMapping("/product/{id}")
	public productoDTO update(@PathVariable String id, @Validated @RequestBody productoDTO p) {
		return repository.save(p);
	}

	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}
