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
@Table(name = "reservatiohotel")
public class reservatiohotel implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservationhotel_id")
private Integer reservationhotel_id;
	@Column(name = "user_id")
private Integer user_id;
	@Column(name = "estado_hotelreserv")
	private Boolean estadohotelreserv;
    
	@ManyToOne
    @JoinColumn(name="hotel_id", nullable=false)
private hotel hotel_id;
	@Column(name = " fechareserva")
private Date fechareserva;
	@Column(name = "price")
private Double price;
	@Column(name = "cantidad")
private Integer cantidad;
	@Column(name = "anticipo")
private Double anticipo;
	public reservatiohotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getReservationhotel_id() {
		return reservationhotel_id;
	}
	public void setReservationhotel_id(Integer reservationhotel_id) {
		this.reservationhotel_id = reservationhotel_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
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
	public Boolean getEstadohotelreserv() {
		return estadohotelreserv;
	}
	public void setEstadohotelreserv(Boolean estadohotelreserv) {
		this.estadohotelreserv = estadohotelreserv;
	}
	public hotel getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(hotel hotel_id) {
		this.hotel_id = hotel_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
