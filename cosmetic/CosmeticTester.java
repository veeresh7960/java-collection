package com.xworkz.cosmetic;

import com.xworkz.cosmetic.constants.Cosmeticshades;
import com.xworkz.cosmetic.dao.CosmeticDAOImpl;
import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {

		CosmeticDTO cosmeticDTO = new CosmeticDTO();

		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setType(CosmeticType.TONER);
		cosmeticDTO.setPrice(300);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setShades(Cosmeticshades.RED);
		cosmeticDTO.getBrand();
		cosmeticDTO.getType();
		System.out.println(cosmeticDTO.toString());
		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("himalaya", Cosmeticshades.RED, CosmeticType.TONER, 300, 50);
		System.out.println(cosmeticDTO2.toString());
		CosmeticDTO cosmeticDTO3 = new CosmeticDTO("Lakme", Cosmeticshades.pink, CosmeticType.LIPSTICK, 295, 1);
		System.out.println(cosmeticDTO3.toString());
		CosmeticDAOImpl dao = new CosmeticDAOImpl();

		dao.save(cosmeticDTO2);
		dao.save(cosmeticDTO);
		dao.save(cosmeticDTO3);

		CosmeticDTO findByBrand = dao.findByBrand("Lakme");
		System.out.println(findByBrand);
		boolean updatePriceByBrandAndType = dao.updatePriceByBrandAndType(295, 1, "Lakme");
		System.out.println(updatePriceByBrandAndType);
		
		boolean deleteByBrand = dao.deleteByBrand("Lakme");
		System.out.println(deleteByBrand);
		
		
		dao.deleteAll();
		
		int totalSize = dao.totalSize();
		System.out.println(totalSize);
		
	}

}
