package com.javatechie.crud.example.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class hotel implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_id")
	private Integer hotel_id;
	@Column(name = "estado_hotel")
	private Boolean estadohotel;
	@Column(name = "numvuelo")
	private Integer numvuelo;
	@Column(name = "plazas")
	private Integer plazas;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "price")
	private Double price;
	@OneToMany(mappedBy = "hotel_id")
	private List<reservatiohotel> id_rehotel;
	
	
	public hotel(Integer hotel_id, Integer numvuelo, Integer plazas, String direccion, Double price) {
		super();
		this.hotel_id = hotel_id;
		this.numvuelo = numvuelo;
		this.plazas = plazas;
		this.direccion = direccion;
		this.price = price;
	}
	public hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(Integer hotel_id) {
		this.hotel_id = hotel_id;
	}
	public Integer getNumvuelo() {
		return numvuelo;
	}
	public void setNumvuelo(Integer numvuelo) {
		this.numvuelo = numvuelo;
	}
	public Integer getPlazas() {
		return plazas;
	}
	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Boolean getEstadohotel() {
		return estadohotel;
	}
	public void setEstadohotel(Boolean estadohotel) {
		this.estadohotel = estadohotel;
	}
	public List<reservatiohotel> getId_rehotel() {
		return id_rehotel;
	}
	public void setId_rehotel(List<reservatiohotel> id_rehotel) {
		this.id_rehotel = id_rehotel;
	}
	
	

}
