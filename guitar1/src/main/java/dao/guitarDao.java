package dao;

import java.util.List;

import entity.guitar;

public interface guitarDao {
	public  guitar search (String serialNumber);
	public boolean add(guitar Guitar);
	public List<guitar> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood);
}
