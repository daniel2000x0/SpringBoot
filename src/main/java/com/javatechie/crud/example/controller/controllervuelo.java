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


import com.javatechie.crud.example.Interfaces.IVueloService;

import com.javatechie.crud.example.model.vuelo;

@RestController
@RequestMapping("/vuelo")
@CrossOrigin(origins = "*")
public class controllervuelo {
	@Autowired
	private IVueloService vueloservice;
	
	@GetMapping("/listaravuelo")
	public List<vuelo> index() {
		return vueloservice.findAll();

	}
	@GetMapping("/vuelodelete/{id}")
	public ResponseEntity<vuelo> delete(@PathVariable Long id) {
		vuelo vuelocotrol = vueloservice.findById(id);
		if (vuelocotrol != null) {
			vueloservice.delete(id);
		} else {
			return new ResponseEntity<vuelo>(vuelocotrol, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<vuelo>(vuelocotrol, HttpStatus.OK);

	}
	
	
	

	@PutMapping("/updatevuelo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	
	public ResponseEntity<?> update(@Validated @RequestBody vuelo vuelocontr, BindingResult result, @PathVariable Long id) {

	vuelo vueloActual = vueloservice.findById(id);

	vuelo vueloUpdated = null;

		Map<String, Object> response = new HashMap<>();

		if(result.hasErrors()) {

			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '" + err.getField() +"' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		if (vueloActual == null) {
			response.put("mensaje", "Error: no se pudo editar, el cliente ID: "
					.concat(id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		try {

			vueloActual.setEstadovuelo(vuelocontr.getEstadovuelo());
			

			vueloUpdated = vueloservice.save(vueloActual);

		} catch (DataAccessException e) {
			response.put("mensaje", "Error al actualizar la falta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("mensaje", "El cliente ha sido actualizado con éxito!");
		response.put("cliente", vueloUpdated);

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	@PostMapping("/vuelosave")
	@ResponseStatus(HttpStatus.CREATED)
	
public ResponseEntity<?> createclase(@Validated @RequestBody vuelo vuelos, BindingResult result) {
		
		vuelo vueloNew = null;

	
		Map<String, Object> response = new HashMap<>();

		if (result.hasErrors()) {

			List<String> errors = result.getFieldErrors().stream()
					.map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());

			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		try {

			vueloNew = vueloservice.save(vuelos);
		
		} catch (DataAccessException e) {

			response.put("mensaje", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		
		response.put("mensaje", "la clase ha sido creado con éxito!");
		response.put("cliente", vueloNew);


		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
}
