package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallDAO;
import com.xworkz.waterfall.dao.WaterFallDAOImpl;
import com.xworkz.waterfall.entity.WaterfallEntity;

public class SFTester {

	public static void main(String[] args) {
		WaterfallEntity entity=new WaterfallEntity();
		 entity.setName("jog falls");
		 entity.setLocation("shivmoga");
		 entity.setDepth(1000);
		 entity.setHeight(300);
		 entity.setElectriciyGenerated(true);
		 entity.setEntryFees(200);
		 entity.setNoOfDeath(5);
		 entity.setNoOfVisitors(20000);
		 entity.setRating(9);
		 entity.setSourceRiver("tunga");
		 entity.setDestination("india");
		 
		 WaterFallDAO dao=new WaterFallDAOImpl();
		// dao.create(entity);
		 
		 WaterfallEntity id = dao.getById(1);
		 System.out.println(id);
		
		 dao.updateHeightAndDepthById(2, 987, 1387);
		 
		 dao.deleteById(2);
	}

}
