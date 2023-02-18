package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "it_seq")
	@SequenceGenerator(name = "it_seq", sequenceName = "it_seq", allocationSize = 1)
	@Column(name="it_id")
	private Integer id;
	
	@Column(name="it_")
	private  String codigoBarra;
	
	@Column(name="it_")
	private String nombre;
	
	@Column(name="it_")
	private String tipo;
	
	@Column(name="it_")
	private Integer Stock;
	
	@Column(name="it_")
	private BigDecimal precio;
	
	@OneToMany(mappedBy = "item")
	private List<DetalleFactura>detallles;
	
	
	

	@Override
	public String toString() {
		return "Item [id=" + id + ", codigoBarra=" + codigoBarra + ", nombre=" + nombre + ", tipo=" + tipo + ", Stock="
				+ Stock + ", precio=" + precio + ", detallles=" + detallles + "]";
	}

	//Set and Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getStock() {
		return Stock;
	}

	public void setStock(Integer stock) {
		Stock = stock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public List<DetalleFactura> getDetallles() {
		return detallles;
	}

	public void setDetallles(List<DetalleFactura> detallles) {
		this.detallles = detallles;
	}
	
	
	

}
