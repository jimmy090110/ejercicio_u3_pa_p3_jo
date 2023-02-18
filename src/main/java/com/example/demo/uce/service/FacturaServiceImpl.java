package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Factura;
import com.example.demo.uce.repository.IFacturaRepository;
@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepository facturaRepository;
	
	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepository.insertar(factura);
		
		
	}

	@Override
	public Factura buscar(String numero) {
		// TODO Auto-generated method stub
		return this.facturaRepository.buscar(numero);
	}

}
