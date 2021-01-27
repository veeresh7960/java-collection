package com.xworkz.cosmetic.service;

import com.xworkz.cosmetic.constants.CosmeticType;
import com.xworkz.cosmetic.constants.Cosmeticshades;
import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService {

	public CosmeticServiceImpl() {
		System.out.println("created CosmeticServiceImpl");
	}

	@Override
	public boolean vlidateAndsave(CosmeticDTO cosmeticDTO) {
		boolean validate = false;
		if (cosmeticDTO != null) {
			System.out.println(" dto is null, add data");
			String brand = cosmeticDTO.getBrand();
			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid ");
				validate = true;
			} else {
				System.out.println(" brand is invlid");
				validate = false;

			}

			CosmeticType cosmeticType = cosmeticDTO.getType();
			if (validate && cosmeticType != null) {
				System.out.println(" type is valid ");
				validate = true;
			} else {
				System.out.println("type is invalid ");
				validate = false;

			}

			Cosmeticshades cosmeticshades = Cosmeticshades.RED;
			if (validate && cosmeticshades != null) {
				System.out.println("shade is valid");
				validate = true;

			} else {
				System.out.println("shade is invalid");
				validate = false;

			}

			int price = cosmeticDTO.getPrice();
			if (validate && price >= 0) {
				System.out.println("price is valid");
				validate = true;
			} else {
				System.out.println("price is invalid");
				validate = false;

			}
			int quantity = cosmeticDTO.getQuantity();
			if (validate && quantity > 0 && quantity <= 100) {
				System.out.println(" quantity is valid");
				validate = true;
			} else {
				System.out.println("quantity is invalid");
				validate = false;

			}

		} else {
			System.out.println("enter valid data");
		}
		return false;
	}

}
