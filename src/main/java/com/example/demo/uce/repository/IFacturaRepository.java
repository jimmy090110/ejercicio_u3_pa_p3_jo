package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Factura;


public interface IFacturaRepository {
	public void insertar(Factura factura);
	public Factura buscar(String numero );
	
	

}
