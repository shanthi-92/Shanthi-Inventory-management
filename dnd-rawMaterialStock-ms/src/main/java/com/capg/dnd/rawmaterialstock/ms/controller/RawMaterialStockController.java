package com.capg.dnd.rawmaterialstock.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;
import com.capg.dnd.rawmaterialstock.ms.service.UpdateRMstockServiceImpl;

@RestController

@RequestMapping("/RawMaterialStock")

public class RawMaterialStockController {
	
	@Autowired
	UpdateRMstockServiceImpl service;
	
	@PostMapping("/add")
	public RawMaterialStock addRawMaterialStock(@RequestBody RawMaterialStock stock) {
		
		 return service.addRawMaterialStock(stock);
	}
	@DeleteMapping("/delete/{orderId}")

	public boolean deleteRawMaterialStock(@PathVariable("orderId") String orderId) {
		return service.deleteRawMaterialStock(orderId);
	}

	
	@GetMapping("/all")
	public List<RawMaterialStock> getAllRawMaterialStockDetails(){
		return service.getAllRawMaterialStockDetails();
	}
	
	
	
	  @ExceptionHandler public String errorMessage(Exception e) {
		  return e.getMessage(); }
	 
	
}
