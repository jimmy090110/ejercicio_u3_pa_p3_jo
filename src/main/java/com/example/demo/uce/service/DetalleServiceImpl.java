package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.DetalleFactura;

@Service
public class DetalleServiceImpl implements IDetalleFacturaService {

	@Autowired
	private IDetalleFacturaService detalleFacturaService;
	@Override
	public void insertar(DetalleFactura detalle) {
		// TODO Auto-generated method stub
		this.detalleFacturaService.insertar(detalle);
		
	}

	@Override
	public DetalleFactura buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.detalleFacturaService.buscar(id);
	}

}
