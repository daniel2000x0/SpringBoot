package com.javatechie.crud.example.Interfaces;

import java.util.List;

import com.javatechie.crud.example.model.hotel;

public interface IHotelService {
	public List<hotel> findAll();
	public hotel findById(Long id);
	public hotel save(hotel hotel);
	public void delete(Long id);

}
