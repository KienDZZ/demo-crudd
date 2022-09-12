package com.vti.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.Csvdto;
import com.vti.entity.Csv;
import com.vti.form.CsvCreateForm;
import com.vti.service.ICsvService;

@RestController
@RequestMapping(value = "api/v1/csv")
@CrossOrigin("*")
public class CsvController {
	
	@Autowired ICsvService service;
	
	@GetMapping()
	public ResponseEntity<?> getAllCsv(){
		List<Csv> entities = service.getAllCsv();
		
		List<Csvdto> Csvdto = new ArrayList<>();
		
		for (Csv csv : entities) {
			Csvdto dto = new Csvdto(csv.getFileName(), csv.getLink(), csv.getCreatedAt());
			Csvdto.add(dto);
		}
		return new ResponseEntity<>(Csvdto, HttpStatus.OK);

	}
	
	
	@PostMapping()
	public ResponseEntity<?> createAccount(@Valid @RequestBody CsvCreateForm form){
		service.createCsv(form);
		return new ResponseEntity<String>("create success",HttpStatus.CREATED);
	}

}
