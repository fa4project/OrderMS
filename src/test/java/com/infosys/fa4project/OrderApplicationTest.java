package com.infosys.fa4project;

import java.sql.Date;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.infosys.fa4project.Order.dto.OrderDTO;
import com.infosys.fa4project.Order.entity.OrderStatus;
import com.infosys.fa4project.Order.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=OrderApplicationTest.class)
public class OrderApplicationTest {
	
	@Mock
	OrderService orderService = new OrderService();
	
	@Test
	public void getSpecificOrder1() {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderId(1);
		orderDTO.setBuyerId(11);
		orderDTO.setAmount((double) 12345);
		orderDTO.setDate(Date.valueOf("2020-01-28"));
		orderDTO.setAddress("HYD");
		orderDTO.setStatus(OrderStatus.ORDER_PLACED);
		Mockito.when(orderService.getSpecificOrder(1)).thenReturn(orderDTO);
		Assert.assertEquals(orderService.getSpecificOrder(1), orderDTO);
	}
	
	@Test
	public void getSpecificOrder2() {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderId(1);
		orderDTO.setBuyerId(11);
		orderDTO.setAmount((double) 12345);
		orderDTO.setDate(Date.valueOf("2020-01-28"));
		orderDTO.setAddress("HYD");
		orderDTO.setStatus(OrderStatus.ORDER_PLACED);
		Mockito.when(orderService.getSpecificOrder(1)).thenReturn(orderDTO);
		Assert.assertNotEquals(orderService.getSpecificOrder(1), null);
	}
}
