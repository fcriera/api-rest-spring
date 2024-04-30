package com.keepcoding.api.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.api.rest.dao.ClienteDao;
import com.keepcoding.api.rest.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	public List<Cliente> buscarTodos() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
