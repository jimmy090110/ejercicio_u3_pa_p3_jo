package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
@Table(name="factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fac_seq")
	@SequenceGenerator(name = "fac_seq", sequenceName = "fac_seq", allocationSize = 1)
	@Column(name="fac_id")		
	private Integer id;
	
	@Column(name="fac_numero")
	private String numero;
	
	@Column(name="fac_fecha")
	private LocalDateTime fecha;
	
	@Column(name="fac_cedula")
	private String cedula;
	
	@Column(name="fac_total_venta")
	private BigDecimal TotalVenta;
	
	
	@OneToMany(mappedBy = "factura")
	private List<DetalleFactura>detallles;


	
	
	
	@Override
	public String toString() {
		return "Factura [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedula=" + cedula + ", TotalVenta="
				+ TotalVenta + ", detallles=" + detallles + "]";
	}


	//Set and Get
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public BigDecimal getTotalVenta() {
		return TotalVenta;
	}


	public void setTotalVenta(BigDecimal totalVenta) {
		TotalVenta = totalVenta;
	}


	public List<DetalleFactura> getDetallles() {
		return detallles;
	}


	public void setDetallles(List<DetalleFactura> detallles) {
		this.detallles = detallles;
	}
	
	
	
	
	
	

}
