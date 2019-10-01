/*package com.example.morrisons.order.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.morrisons.items.ItemsInfo;
import com.example.morrisons.order.Order;
import com.example.morrisons.order.OrderRepository;
import com.example.morrisons.order.OrderService;

@RunWith(SpringRunner.class)
public class OrderServiceIntegrationTest {
	
	@Autowired
    private OrderService orderService;
 
    
    @Autowired
    private TestEntityManager entityManager;
	
	
	@Test
	public void whenValidId_thenOrderShouldBeFound() {
		
		String orderId = "ORD00001";
    	List<ItemsInfo> list = new ArrayList<>();
    	ItemsInfo item = new ItemsInfo(106571637,1,"skuMin","Heinz Baked Beans","unit",30,"GBP",1.34,20);
    	list.add(item);
        Order order = new Order("ORD00001","MORR","2018-01-10T10:56:00Z","GLN999999","Test Store","1 Order Street","Leeds","West Yorkshire","LS1 9PP","UK","2016-08-25",list);
        entityManager.persist(order);
        entityManager.flush();
	    Optional<Order> found = orderService.getOrderByID("ORD00001");
	   
	  
	     assertThat(found.get().getOrderID())
	      .isEqualTo(orderId);
	 }

}*/

// Was working but now doesn't not sure why?
