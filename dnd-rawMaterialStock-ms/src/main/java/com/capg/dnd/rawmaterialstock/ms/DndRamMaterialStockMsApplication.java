package com.capg.dnd.rawmaterialstock.ms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;

@SpringBootApplication

public class DndRamMaterialStockMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndRamMaterialStockMsApplication.class, args);
		System.out.println("hello Spring");
	}
	 
	@Bean
	public RawMaterialStock getRawMaterialStock() {
		return new RawMaterialStock();
		
	}
	

	
}
