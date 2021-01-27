package com.xworkz.cosmetic.dao;

import java.util.List;

import com.xworkz.cosmetic.dto.CosmeticDTO;

public interface CosmeticDAO  {
	
	boolean save(CosmeticDTO dto);
	CosmeticDTO findByBrand(String  brand);
	boolean updatePriceByBrandAndType(double price,int quality,String brand);
	boolean deleteByBrand(String brand);
	void deleteAll();
	List<CosmeticDTO> getAll();
	int totalSize();
	
	

}
