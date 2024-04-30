package com.keepcoding.api.rest.service;

import java.util.List;

import com.keepcoding.api.rest.entity.Cliente;

public interface ClienteService {
	//Metodo para devolver todos los regristros
	public List<Cliente> buscarTodos();
	//Metodo para buscar un regristro por Id
	public Cliente buscarPorId(Long id);
	//Metodo para registrar
	public Cliente guardar(Cliente cliente);
	//Metodo para eliminar
	public Void delete(Long id);
}
