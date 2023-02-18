package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Item;

public interface IItemRepository {
	
	public void insertar(Item item);
	public Item buscar(String codigoBarra );
	

}
