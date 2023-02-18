package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Item;
import com.example.demo.uce.repository.IItemRepository;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private IItemRepository iItemRepository;
	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		this.iItemRepository.insertar(item);
		

	}

	@Override
	public Item buscar(String codigoBarra) {
		// TODO Auto-generated method stub
		return this.iItemRepository.buscar(codigoBarra);
	}

}
