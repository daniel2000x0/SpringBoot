package com.javatechie.crud.example.Interfaces;

import java.util.List;

import com.javatechie.crud.example.model.reservatiohotel;
import com.javatechie.crud.example.service.serviceHotel;

public interface IReservatioHotelService {
	public List<reservatiohotel > findAll();
	public reservatiohotel findById(Long id);
	public reservatiohotel save(reservatiohotel reservatiohotel);
	public void delete(Long id);
}
