package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.DetalleFactura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DetalleRepositoryImpl implements IDetalleFacturaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(DetalleFactura detalle) {
		// TODO Auto-generated method stub

	}

	@Override
	public DetalleFactura buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
