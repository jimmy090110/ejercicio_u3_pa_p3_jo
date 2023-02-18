package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ItemRepositoryImpl implements IItemRepository {

	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item buscar(String codigoBarra) {
		// TODO Auto-generated method stub
		return null;
	}

}
