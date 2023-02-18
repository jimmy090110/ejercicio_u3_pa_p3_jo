package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Factura;


public interface IFacturaService {
	public void insertar(Factura factura);
	public Factura buscar(String numero );
	
	

}
