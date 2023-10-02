package com.javatechie.crud.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.crud.example.Interfaces.IReservationService;

import com.javatechie.crud.example.model.reservation;

@RestController
@RequestMapping("/reservation")
@CrossOrigin(origins = "*")
public class controllerreservation {
	@Autowired
	private IReservationService reservationservice;
	
	@GetMapping("/listarreservation")
	public List<reservation> index() {
		return reservationservice.findAll();

	}
	@GetMapping("/reservationdelete/{id}")
	public ResponseEntity<reservation> delete(@PathVariable Long id) {
	    reservation reservationctr = reservationservice.findById(id);
		if (reservationctr  != null) {
			reservationservice.delete(id);
		} else {
			return new ResponseEntity<reservation>(reservationctr , HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<reservation>(reservationctr , HttpStatus.OK);

	}
	
	
	

	@PutMapping("/updatereservation/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	
	public ResponseEntity<?> update(@Validated @RequestBody reservation reservationcontrl, BindingResult result, @PathVariable Long id) {

	reservation reservationActual = reservationservice.findById(id);

	reservation reservationUpdated = null;

		Map<String, Object> response = new HashMap<>();

		if(result.hasErrors()) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		if (reservationActual == null) {
			response.put("mensaje", "Error: no se pudo editar, el cliente ID: "
					.concat(id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		try {

			reservationActual.setEstadoreserv(reservationcontrl.getEstadoreserv());
			

			reservationUpdated = reservationservice.save(reservationActual);

		} catch (DataAccessException e) {
			response.put("mensaje", "Error al actualizar la falta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("mensaje", "El cliente ha sido actualizado con éxito!");
		response.put("cliente", reservationUpdated);

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	@PostMapping("/reservation/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	
public ResponseEntity<?> createclase(@Validated @RequestBody reservation reservations, BindingResult result) {
		
		reservation reservationNew = null;

	
		Map<String, Object> response = new HashMap<>();

		if (result.hasErrors()) {

			List<String> errors = result.getFieldErrors().stream()
					.map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());

			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		try {

			reservationNew = reservationservice.save(reservations);
		
		} catch (DataAccessException e) {

			response.put("mensaje", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		
		response.put("mensaje", "la clase ha sido creado con éxito!");
		response.put("cliente", reservationNew);


		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
}
