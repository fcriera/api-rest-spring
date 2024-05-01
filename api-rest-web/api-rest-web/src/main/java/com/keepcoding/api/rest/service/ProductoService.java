package com.keepcoding.api.rest.service;

import java.util.List;

import com.keepcoding.api.rest.entity.Producto;

public interface ProductoService {

	public List<Producto> buscarProductos();
	
	public Producto buscarProdPorId(Long id);
	
	public Producto guardarProd(Producto producto);
	
	public Producto borrarProd(Long id);
}
