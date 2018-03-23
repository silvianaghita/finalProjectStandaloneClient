package com.example.finalproject.standaloneclient;

import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.example.finalprojectejb.FinalProjectStatelessEjbRemote;
import com.example.finalprojectejb.dao.ClientB2BDAORemote;
import com.example.finalprojectejb.dao.ClientB2CDAORemote;
import com.example.finalprojectejb.dao.ClientOrderDAORemote;
import com.example.finalprojectejb.dao.OrderItemDAORemote;
import com.example.finalprojectejb.dao.PlatformUserDAORemote;
import com.example.finalprojectejb.dao.PromoDAORemote;
import com.example.finalprojectejb.dao.StockClientB2BDAORemote;
import com.example.finalprojectejb.dao.StockSupplierDAORemote;
import com.example.finalprojectejb.dao.SupplierDAORemote;
import com.example.finalprojectejb.dao.WineDAORemote;
import com.example.finalprojectejb.dto.ClientB2BDTO;
import com.example.finalprojectejb.dto.ClientB2CDTO;
import com.example.finalprojectejb.dto.ClientOrderDTO;
import com.example.finalprojectejb.dto.OrderItemDTO;
import com.example.finalprojectejb.dto.PlatformUserDTO;
import com.example.finalprojectejb.dto.PromoDTO;
import com.example.finalprojectejb.dto.StockClientB2BDTO;
import com.example.finalprojectejb.dto.StockSupplierDTO;
import com.example.finalprojectejb.dto.SupplierDTO;
import com.example.finalprojectejb.dto.WineDTO;

public class Test {
	
	public static void main(String[] args) throws NamingException  {
		
		InitialContext context;
			context = new InitialContext();
			ClientB2BDAORemote clientB2BRemote=(ClientB2BDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/ClientB2BDAO!com.example.finalprojectejb.dao.ClientB2BDAORemote");
			ClientB2CDAORemote clientB2CRemote=(ClientB2CDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/ClientB2CDAO!com.example.finalprojectejb.dao.ClientB2CDAORemote");
			ClientOrderDAORemote clientOrderRemote=(ClientOrderDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/ClientOrderDAO!com.example.finalprojectejb.dao.ClientOrderDAORemote");
			PlatformUserDAORemote platformUserRemote=(PlatformUserDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/PlatformUserDAO!com.example.finalprojectejb.dao.PlatformUserDAORemote");
			OrderItemDAORemote orderItemRemote=(OrderItemDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/OrderItemDAO!com.example.finalprojectejb.dao.OrderItemDAORemote");
			PromoDAORemote promoRemote=(PromoDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/PromoDAO!com.example.finalprojectejb.dao.PromoDAORemote");
			StockClientB2BDAORemote stockClientB2BRemote=(StockClientB2BDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/StockClientB2BDAO!com.example.finalprojectejb.dao.StockClientB2BDAORemote");
			StockSupplierDAORemote stockSupplierRemote=(StockSupplierDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/StockSupplierDAO!com.example.finalprojectejb.dao.StockSupplierDAORemote");
			SupplierDAORemote supplierRemote=(SupplierDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/SupplierDAO!com.example.finalprojectejb.dao.SupplierDAORemote");
			WineDAORemote wineRemote=(WineDAORemote)context.lookup(
					"java:global/finalProjectEAR/finalProjectEJB/WineDAO!com.example.finalprojectejb.dao.WineDAORemote");
	
			
			// PlatformUser 
			
			/*PlatformUserDTO user=new PlatformUserDTO()
	        		.setUsername("user2")
	        		.setPassword("123456")
	        		.setAddress("str. N. Balcescu nr. 29, Brasov")
	        		.setEmail("user2@yahoo.com");
			platformUserRemote.insert(user);
			
			PlatformUserDTO existingUser=platformUserRemote.findById(3);
			
			existingUser.setUsername("User1");
			platformUserRemote.update(existingUser);*/
			
		/*	
			PlatformUserDTO userToDelete=platformUserRemote.findById(4);
			platformUserRemote.delete(userToDelete);*/
			
			
			// ClientB2BDTO
			
			/*ClientB2BDTO client= new ClientB2BDTO();
			client.setBusinessName("business1")
					.setUsername("username")
			        .setPassword("12345");
		    clientB2BRemote.insert(client);*/
		    
		    
		 /*   ClientB2CDTO clientB2C= new ClientB2CDTO();
		    clientB2C.setLastName("lastName")
		            .setFirstName("firstName")
					.setUsername("username")
			        .setPassword("12345");
		    clientB2CRemote.insert(clientB2C);*/
			
			/*WineDTO wine=new WineDTO()
					.setName("wine1");
			wineRemote.insert(wine);*/
			
			/*SupplierDTO supplier = new SupplierDTO();
			supplier.setAge(10)
					.setAddress("address1")
					.setUsername("supplier1");
			supplierRemote.insert(supplier);*/
			
			/*PromoDTO promo =new PromoDTO();
			promo.setDiscount(20);
			promoRemote.insert(promo);*/
			
			
		 /*  WineDTO wine1=wineRemote.findById(1);
			SupplierDTO supplier1=supplierRemote.findById(7);
			StockSupplierDTO stockSupplier=new StockSupplierDTO();
			stockSupplier.setPrice(25)
			.setSupplier(supplier1)
			.setWine(wine1)
			.setQuantity(40);
			
			stockSupplierRemote.insert(stockSupplier);*/
			
			
			/*ClientOrderDTO clientOrder=new ClientOrderDTO();
			clientOrder.setDate(new Date());
			clientOrderRemote.insert(clientOrder);
			
			ClientOrderDTO orderFromDB=clientOrderRemote.findById(1);
			
			OrderItemDTO orderItem=new OrderItemDTO();
			orderItem.setPrice(10)
			.setQuantity(20)
			.setOrder(orderFromDB);
			
			orderItemRemote.insert(orderItem);
			*/
			
			
			ClientB2BDTO existingClient=new ClientB2BDTO();
			existingClient=clientB2BRemote.findById(5);
			
			StockClientB2BDTO stockClientB2bDTO=new StockClientB2BDTO();
			stockClientB2bDTO.setPrice(20)
			.setQuantity(10)
			.setClientB2B(existingClient)
			.setActive(true)
			.setLimitQuantity(2);
			
		     stockClientB2BRemote.insert(stockClientB2bDTO);
			
		
			
			
	
	}

}
