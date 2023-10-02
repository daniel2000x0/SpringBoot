package com.javatechie.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javatechie.crud.example.Interfaces.IReservatioHotelService;
import com.javatechie.crud.example.model.reservatiohotel;
import com.javatechie.crud.example.model.dao.IReservationHotelDao;


public class serviceReservationHotel implements IReservatioHotelService {
    @Autowired
    private IReservationHotelDao reservahotel;
	@Override
	public List<reservatiohotel> findAll() {
		// TODO Auto-generated method stub
		return reservahotel.findAll();
	}

	@Override
	public reservatiohotel findById(Long id) {
		// TODO Auto-generated method stub
		return reservahotel.findById(id).orElse(null);
	}

	@Override
	public reservatiohotel save(reservatiohotel reservatiohotel) {
		// TODO Auto-generated method stub
		return reservahotel.save(reservatiohotel);
	}

	@Override
	public void delete(Long id) {
		reservahotel.deleteById(id);
		
	}

}
