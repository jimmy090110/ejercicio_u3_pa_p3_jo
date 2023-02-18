package com.example.demo.uce.service;

import com.example.demo.uce.modelo.DetalleFactura;


public interface IDetalleFacturaService {
	
	public void insertar(DetalleFactura detalle);
	public DetalleFactura buscar(Integer id );
	
	

}
