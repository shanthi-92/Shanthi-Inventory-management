package com.capg.dnd.rawmaterialstock.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.dnd.rawmaterialstock.ms.exception.RMIdAlreadyExistException;
import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialOrder;
import com.capg.dnd.rawmaterialstock.ms.model.RawMaterialStock;
import com.capg.dnd.rawmaterialstock.ms.repository.IupdatermstockDAO;

@Service
public class UpdateRMstockServiceImpl implements IUpdateRMStockService {

	@Autowired
	IupdatermstockDAO repo;

@Autowired
	RawMaterialStock tempStock;
@Override
		public RawMaterialStock addRawMaterialStock(RawMaterialStock stock) throws RMIdAlreadyExistException{
			if(repo.existsById(stock.getOrderId()))
			{
			throw new RMIdAlreadyExistException("order Id alaready exists");
			}
			return repo.save(stock);
				
		}
@Override
	public boolean deleteRawMaterialStock(String orderId) {
		repo.deleteById(orderId);
		return (!repo.existsById(orderId));
	}
@Override
	public RawMaterialStock getRawMaterialStockDetails(String orderId) {
		return repo.getOne(orderId);
	}
@Override
	public List<RawMaterialStock> getAllRawMaterialStockDetails() {
		System.out.println(repo.findAll());
		return repo.findAll();
	}
	 



	}
