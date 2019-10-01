package com.example.morrisons.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// item service to add and get the lsit of all of the items
@Service
public class ItemsService {
	
	@Autowired
	private ItemsRepository itemRepository;

	public List<ItemsInfo> getAllItems() {
		// TODO Auto-generated method stub
		List <ItemsInfo> orders = new ArrayList<>();
		itemRepository.findAll().forEach(orders::add);
		return orders;
	}
	
	public void addItem(ItemsInfo order) {
		// TODO Auto-generated method stub
		
		itemRepository.save(order);
		
	}
	

}
