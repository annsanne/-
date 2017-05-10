package service;
import java.util.List;

import dao.guitarDao;
import dao.guitarDaoJDBCImpl;
import entity.guitar;

public class GuitarService {

	private static guitarDaoJDBCImpl guitarDao=new guitarDaoJDBCImpl();
	public boolean add(guitar Guitar){
	    return	guitarDao.add(Guitar);		
	}
	
	public static guitarDaoJDBCImpl getGuitarDao() {
		return guitarDao;
	}

	public static void setGuitarDao(guitarDaoJDBCImpl guitarDao) {
		GuitarService.guitarDao = guitarDao;
	}

	public List<guitar> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood) {
		// TODO Auto-generated method stub
		return guitarDao.getAll(price,serialNumber, builder, model, type, backWood, topWood);
	}	

}