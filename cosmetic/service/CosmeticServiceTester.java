package com.xworkz.cosmetic.service;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.constants.Cosmeticshades;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticServiceTester {

	public static void main(String[] args) {

		CosmeticDTO cosmeticDTO = new CosmeticDTO();

		cosmeticDTO.setBrand("lakme");
		cosmeticDTO.setPrice(99);
		cosmeticDTO.setQuantity(1000);
		cosmeticDTO.setShades(Cosmeticshades.RED);
		cosmeticDTO.setType(CosmeticType.LIPSTICK);
		CosmeticServiceImpl cosmeticServiceImpl = new CosmeticServiceImpl();
		cosmeticServiceImpl.vlidateAndsave(cosmeticDTO);
	}

}
