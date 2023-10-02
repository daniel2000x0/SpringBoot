package com.javatechie.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javatechie.crud.example.Interfaces.IHotelService;
import com.javatechie.crud.example.Interfaces.IReservatioHotelService;
import com.javatechie.crud.example.model.hotel;
import com.javatechie.crud.example.model.reservatiohotel;
import com.javatechie.crud.example.model.dao.IHotelDao;

public class serviceHotel implements IHotelService{
@Autowired
private IHotelDao hoteldao;

@Override
public List<hotel> findAll() {
	// TODO Auto-generated method stub
	return hoteldao.findAll();
}

@Override
public hotel findById(Long id) {
	// TODO Auto-generated method stub
	return hoteldao.findById(id).orElse(null);
}

@Override
public hotel save(hotel hotel) {
	// TODO Auto-generated method stub
	return hoteldao.save(hotel);
}

@Override
public void delete(Long id) {
	hoteldao.deleteById(id);
	
}
	

}
