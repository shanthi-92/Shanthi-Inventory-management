package com.capg.dnd.rawMaterialStock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;
import com.capg.dnd.rawmaterialstock.ms.repository.IupdatermstockDAO;
import com.capg.dnd.rawmaterialstock.ms.service.UpdateRMstockServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
class DndRamMaterialStockMsApplicationTests {
	@Autowired
	private UpdateRMstockServiceImpl serviceimpl;
	@MockBean
	private IupdatermstockDAO repo;
	@Test
	public void testrm()
	{
		RawMaterialStock stock=mock(RawMaterialStock.class);
		
		serviceimpl.addRawMaterialStock(stock);
		verify(repo).saveAndFlush(stock);
	}
	}
	
	


