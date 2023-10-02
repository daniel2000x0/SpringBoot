package com.javatechie.crud.example.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rol")

public class rol implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol")
	private Long id_rol;
	@Column(name = "rol_name")
	private String rol_name;
	@Column(name = "estado_rol")
	private Boolean estadorol;
   @OneToMany(targetEntity=Users.class, mappedBy="rol_id")
   @OrderBy("name ASC")
   private Set <Users> users = new HashSet<Users>();
	
	public rol() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public rol(Long id_rol, String rol_name, Set<Users> users) {
		super();
		this.id_rol = id_rol;
		this.rol_name = rol_name;
		this.users = users;
	}





	public Long getId_rol() {
		return id_rol;
	}





	public Boolean getEstadorol() {
		return estadorol;
	}





	public void setEstadorol(Boolean estadorol) {
		this.estadorol = estadorol;
	}





	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}





	public Set<Users> getUsers() {
		return users;
	}





	public void setUsers(Set<Users> users) {
		this.users = users;
	}





	public String getRol_name() {
		return rol_name;
	}


	public void setRol_name(String rol_name) {
		this.rol_name = rol_name;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
