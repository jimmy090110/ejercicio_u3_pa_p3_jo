package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="detalle_venta")
public class DetalleFactura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "det_seq")
	@SequenceGenerator(name = "det_seq", sequenceName = "det_seq", allocationSize = 1)
	@Column(name="det_id")
	private Integer id;
	
	@Column(name="det_cantidad")
	private Integer cantidad;
	
	@Column(name="det_precio_Unitario")
	private BigDecimal precioU;
	
	@Column(name="det_subtotla")
	private BigDecimal subtotal;
	
	
	@ManyToOne
	@JoinColumn(name = "vent_id_detalle")
	private Factura venta;
	
	@ManyToOne
	@JoinColumn(name="prod_id_detalle")
	private Item producto;

	
	
	
	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precioU=" + precioU + ", subtotal=" + subtotal
				+ ", venta=" + venta + ", producto=" + producto + "]";
	}

	//Set and Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioU() {
		return precioU;
	}

	public void setPrecioU(BigDecimal precioU) {
		this.precioU = precioU;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getVenta() {
		return venta;
	}

	public void setVenta(Factura venta) {
		this.venta = venta;
	}

	public Item getProducto() {
		return producto;
	}

	public void setProducto(Item producto) {
		this.producto = producto;
	}
	
	
	
	
	
	
	

}
