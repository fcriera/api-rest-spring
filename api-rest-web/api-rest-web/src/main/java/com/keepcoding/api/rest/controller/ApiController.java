package com.keepcoding.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.api.rest.entity.Cliente;
import com.keepcoding.api.rest.entity.Producto;
import com.keepcoding.api.rest.service.ClienteService;
import com.keepcoding.api.rest.service.ProductoService;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private ClienteService servicio;
	
	@Autowired
	private ProductoService servicioProd;

	//metodo get que devuelve todos los clientes
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return servicio.buscarTodos();
	}
	
	//metodo get que devuelve un solo registro dado el id
	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable Long id) {
		return servicio.buscarPorId(id);
	}
	//metodo post para guardar un nuevo cliente
	@PostMapping("/clientes")
	public Cliente create(@RequestBody Cliente cliente) {
		return servicio.guardar(cliente);
	}
	
	//metodo put para actualizar un registro de cliente existente
	@PutMapping("/clientes/{id}")
	public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente) {
		
		Cliente clienteUpdate = servicio.buscarPorId(id); 
		clienteUpdate.setNombre(cliente.getNombre());
		clienteUpdate.setApellido(cliente.getApellido());
		clienteUpdate.setEmail(cliente.getEmail());
		clienteUpdate.setTelefono(cliente.getTelefono());
		clienteUpdate.setCreatedAt(cliente.getCreatedAt());
		
		return servicio.guardar(clienteUpdate);
	}
	
	//metodo delete para borrar
	@DeleteMapping("/clientes/{id}")
	public Cliente delete(@PathVariable Long id) {
		return servicio.borrar(id);
	}
	
	
	//metodo get que devuelve todos los productos
	@GetMapping("/productos")
	public List<Producto> indexProducto(){
		return servicioProd.buscarProductos();
	}
	
	//metodo get que devuelve un solo registro dado el id
	@GetMapping("/productos/{id}")
	public Producto showProd(@PathVariable Long id) {
		return servicioProd.buscarProdPorId(id);
	}
	
	@PostMapping("/productos")
	public Producto createProd(@RequestBody Producto producto) {
		return servicioProd.guardarProd(producto);
	}
	
	@PutMapping("/productos/{id}")
	public Producto updateProd(@PathVariable Long id,@RequestBody Producto newproducto) {
		Producto productoUpdate = servicioProd.buscarProdPorId(id);
		productoUpdate.setNombre(newproducto.getNombre());
		productoUpdate.setCategoria(newproducto.getCategoria());
		productoUpdate.setDescripcion(newproducto.getDescripcion());
		productoUpdate.setTipo(newproducto.getTipo());
		productoUpdate.setPrecio_compra(newproducto.getPrecio_compra());
		productoUpdate.setPrecio_venta(newproducto.getPrecio_venta());
		productoUpdate.setActivo(newproducto.isActivo());
		
		return servicioProd.guardarProd(productoUpdate);
	}
	
	@DeleteMapping("/productos/{id}")
	public Producto deleteProd(@PathVariable Long id) {
		return servicioProd.borrarProd(id);
	}
	
}
