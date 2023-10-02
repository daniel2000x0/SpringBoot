package com.javatechie.crud.example.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo") 
public class vuelo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vuelo_id")
private Integer vuelo_id;
	@Column(name = "avion")
private String avion;
	
	@Column(name = "estado_vuelo")
	private Boolean estadovuelo;
	@Column(name = "plazasdispon")
private Integer plazas_dispon;
	@Column(name = " fecha_inicio")
private Date fecha_inicio;
	@Column(name = "fecha_fin")
private Date fecha_fin;
	@Column(name = "hora_inicio")
private Time hora_inicio;
	@Column(name = "hora_fin")
private Time hora_fin;
	public vuelo(Integer vuelo_id, String avion, Integer plazas_dispon, Date fecha_inicio, Date fecha_fin,
			Time hora_inicio, Time hora_fin) {
		super();
		this.vuelo_id = vuelo_id;
		this.avion = avion;
		this.plazas_dispon = plazas_dispon;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
	}
	public vuelo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getVuelo_id() {
		return vuelo_id;
	}
	public void setVuelo_id(Integer vuelo_id) {
		this.vuelo_id = vuelo_id;
	}
	public String getAvion() {
		return avion;
	}
	public void setAvion(String avion) {
		this.avion = avion;
	}
	public Integer getPlazas_dispon() {
		return plazas_dispon;
	}
	public void setPlazas_dispon(Integer plazas_dispon) {
		this.plazas_dispon = plazas_dispon;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public Time getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(Time hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public Time getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(Time hora_fin) {
		this.hora_fin = hora_fin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Boolean getEstadovuelo() {
		return estadovuelo;
	}
	public void setEstadovuelo(Boolean estadovuelo) {
		this.estadovuelo = estadovuelo;
	}
	
	
	
	
	
}
