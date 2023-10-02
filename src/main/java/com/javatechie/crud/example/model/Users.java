package com.javatechie.crud.example.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users") 
public class Users  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
private  Integer id_user;
	@Column(name = "estado_users")
	private Boolean estadoUsers;
	@Column(name = " username")
private String username;
	@Column(name = " password")
private String password;
	@Column(name = "name")
private String name;
	@Column(name = "lastname")
private String lastname;
	@Column(name = "email")
private String email;
	@Column(name = "create_on")
private Date create_on;
	@Column(name = "last_login")
private Date last_login;  
	@ManyToOne
	   @JoinColumn(name="rol_id", nullable=false)
	private rol rol_id;



	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Integer id_user, String username, String password, String name, String lastname, String email,
			Date create_on, Date last_login) {
		super();
		this.id_user = id_user;
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.create_on = create_on;
		this.last_login = last_login;
	}
	public Integer getId_user() {
		return id_user;
	}
	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreate_on() {
		return create_on;
	}
	public void setCreate_on(Date create_on) {
		this.create_on = create_on;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	
	public Boolean getEstadoUsers() {
		return estadoUsers;
	}
	public void setEstadoUsers(Boolean estadoUsers) {
		this.estadoUsers = estadoUsers;
	}
	public rol getRol_id() {
		return rol_id;
	}
	public void setRol_id(rol rol_id) {
		this.rol_id = rol_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
