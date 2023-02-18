package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Item;

public interface IItemService {
	
	public void insertar(Item item);
	public Item buscar(String codigoBarra );
	

}
