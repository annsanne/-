package dao;

import jdbc.jdbc;
import entity.guitar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class guitarDaoJDBCImpl implements guitarDao{
	@Override
	public boolean add(guitar Guitar) {
		// TODO Auto-generated method stub
		return jdbc.executeUpdate("insert into guitar values(?,?,?,?,?,?,?)", new Object[]{Guitar.getSerialNumber(),Guitar.getPrice(),Guitar.getBuilder(),Guitar.getModel(),Guitar.getType(),Guitar.getBackWood(),Guitar.getTopWood()});		
	}
	@Override
	public List<guitar> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood) {
		// TODO Auto-generated method stub
		String strsql= "select * from guitar where 1 = 1 ";
		if(type.length() > 0){
			strsql+=String.format("and type='"+type+"'");
		}
		if(backWood.length() > 0){
			strsql+=String.format("and backWood='"+backWood+"'");
		}
		if(model.length() > 0){
			strsql+=String.format("and model='"+model+"'");
		}
		if(price!=0){
			strsql+=String.format("and price='"+price+"'");
	   }
		if(serialNumber.length() > 0){
			strsql+=String.format("and serialNumber='"+serialNumber+"'");
	   }	
		if(topWood.length() > 0){
			strsql+=String.format("and topWood='"+topWood+"'");
       }	
	    if(type.length() > 0){
	    	strsql+=String.format("and type='"+type+"'");
       }
		List<guitar> guitarList=new ArrayList<guitar>();
		guitar Guitar=null;
		try{
			ResultSet rs= jdbc.executeQuery(strsql, new Object[]{});
			while(rs.next()){
				Guitar=new guitar();
				Guitar.setSerialNumber(rs.getString(1));
				Guitar.setPrice(rs.getDouble(2));
				Guitar.setBuilder(rs.getString(3));
				Guitar.setModel(rs.getString(4));
				Guitar.setType(rs.getString(5));
				Guitar.setBackWood(rs.getString(6));
				Guitar.setTopWood(rs.getString(7));
				guitarList.add(Guitar);
			}					
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitarList;
}
	@Override
	public guitar search(String serialNumber) {
		// TODO Auto-generated method stub
		return null;
	}
}