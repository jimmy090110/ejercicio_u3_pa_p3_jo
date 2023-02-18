package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.DetalleFactura;


public interface IDetalleFacturaRepository {
	
	public void insertar(DetalleFactura detalle);
	public DetalleFactura buscar(Integer id );
	
	

}
