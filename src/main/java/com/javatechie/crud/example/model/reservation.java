package com.javatechie.crud.example.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")

public class reservation implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id")
	private Integer reservation_id;
	@Column(name = "estado_reservation")
	private Boolean estadoreserv;
		@ManyToOne
	    @JoinColumn(name="hotel_id", nullable=false)
	private hotel hotel_id;
		@ManyToOne
	    @JoinColumn(name="user_id", nullable=false)
	private Users user_id;
	@Column(name = "numvuelo")
	private Integer numvuelo;
	@Column(name = "fechareserva")
	private Date fechareserva;
	@Column(name = "price")
	private Double price;
	@Column(name = "cantidad")
	private Integer cantidad;
	@Column(name = "anticipo")
	private Double anticipo;
	public reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public reservation(Integer reservation_id, hotel hotel_id, Users user_id, Integer numvuelo, Date fechareserva,
			Double price, Integer cantidad, Double anticipo) {
		super();
		this.reservation_id = reservation_id;
		this.hotel_id = hotel_id;
		this.user_id = user_id;
		this.numvuelo = numvuelo;
		this.fechareserva = fechareserva;
		this.price = price;
		this.cantidad = cantidad;
		this.anticipo = anticipo;
	}



	public Boolean getEstadoreserv() {
		return estadoreserv;
	}



	public void setEstadoreserv(Boolean estadoreserv) {
		this.estadoreserv = estadoreserv;
	}



	public hotel getHotel_id() {
		return hotel_id;
	}



	public void setHotel_id(hotel hotel_id) {
		this.hotel_id = hotel_id;
	}



	public Users getUser_id() {
		return user_id;
	}



	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}



	public Integer getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(Integer reservation_id) {
		this.reservation_id = reservation_id;
	}
	
	public Integer getNumvuelo() {
		return numvuelo;
	}
	public void setNumvuelo(Integer numvuelo) {
		this.numvuelo = numvuelo;
	}
	public Date getFechareserva() {
		return fechareserva;
	}
	public void setFechareserva(Date fechareserva) {
		this.fechareserva = fechareserva;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getAnticipo() {
		return anticipo;
	}
	public void setAnticipo(Double anticipo) {
		this.anticipo = anticipo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
