package com.javatechie.crud.example.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.crud.example.model.hotel;


public interface IHotelDao extends JpaRepository<hotel, Long>{

}
