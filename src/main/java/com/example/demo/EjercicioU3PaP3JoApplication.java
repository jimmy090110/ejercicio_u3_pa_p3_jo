package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Item;
import com.example.demo.uce.service.IDetalleFacturaService;
import com.example.demo.uce.service.IFacturaService;
import com.example.demo.uce.service.IItemService;

@SpringBootApplication
public class EjercicioU3PaP3JoApplication implements CommandLineRunner {

	@Autowired
	private IItemService iItemService;
	
	@Autowired 
	private IFacturaService facturaService;
	
	@Autowired
	private IDetalleFacturaService detalleFacturaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU3PaP3JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//1
		Item it = new Item();
		it.setNombre("Pollo");
		it.setCodigoBarra("123a");
		it.setPrecio(new BigDecimal(3));
		it.setStock(6);
		it.setTipo("Carnes");
		
		this.iItemService.insertar(it);
		
		Item it2 = new Item();
		it.setNombre("Pollo");
		it.setCodigoBarra("123a");
		it.setPrecio(new BigDecimal(3));
		it.setStock(6);
		it.setTipo("Carnes");
		
		this.iItemService.insertar(it);
		
		
		//2
		
		
		//3
		
		this.iItemService.buscar("123a");
		
		
		
		
	}

}
