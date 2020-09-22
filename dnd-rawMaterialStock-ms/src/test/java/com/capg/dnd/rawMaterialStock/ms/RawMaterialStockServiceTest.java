package com.capg.dnd.rawMaterialStock.ms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;
import com.capg.dnd.rawmaterialstock.ms.repository.IupdatermstockDAO;
import com.capg.dnd.rawmaterialstock.ms.service.UpdateRMstockServiceImpl;
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class RawMaterialStockServiceTest {
	@Autowired
	UpdateRMstockServiceImpl service;
	@Autowired
	IupdatermstockDAO repo;
	
	RawMaterialStock stock;
	
	@BeforeAll
	void addSampleStock() {
		stock =new RawMaterialStock("75673", "car");
		if(!repo.existsById("75663")) {
			service.addRawMaterialStock(stock);
			
		}
	}

	@Test
	void testAddRawMaterialStock()   {
	RawMaterialStock sentStock=new RawMaterialStock("56789", "Laptop");
	RawMaterialStock addRawMaterialStock= service.addRawMaterialStock(sentStock);
	assertEquals(sentStock,addRawMaterialStock);
	}

	

	@Test
	void testGetRawMaterialStockDetails()  {
		assertTrue(service.getRawMaterialStockDetails("75663")!=null);
	}

	}