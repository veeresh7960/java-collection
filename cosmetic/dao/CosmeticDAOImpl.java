package com.xworkz.cosmetic.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.cosmetic.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticDTO> cosmeticDTOs;

	public CosmeticDAOImpl() {
		this.cosmeticDTOs = new ArrayList<CosmeticDTO>();

	}

	@Override
	public boolean save(CosmeticDTO dto) {
		boolean added = false;
		boolean contains = this.cosmeticDTOs.contains(dto);
		if (!contains) {

			added = this.cosmeticDTOs.add(dto);
		}
		if (added) {
			System.out.println("cosmetic is added");
		} else {
			System.out.println("cosmetic is not added");
		}

		return added;
	}

	@Override
	public CosmeticDTO findByBrand(String brand) {
		System.out.println(" invoke findBybrand");
		System.out.println("brnd " + brand);
		for (CosmeticDTO cosmeticDTO : this.cosmeticDTOs) {
			String brand2 = cosmeticDTO.getBrand();
			if (brand2.equals(brand)) {
				System.out.println("brand is found ");
				return cosmeticDTO;
			}

		}

		return null;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, int quality, String brand) {

		System.out.println("invoke updatePriceByBrandAndType ");
		System.out.println(" brand " + brand);
		System.out.println(" price " + price);
		System.out.println(" quantity " + quality);
		CosmeticDTO findByBrand = this.findByBrand(brand);
		if (findByBrand != null) {
			System.out.println("can update, brand is found");
			findByBrand.setBrand(brand);
			return true;
		} else {
			System.out.println("cannaot  update , brand is not found");
		}

		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println(" invoked deleteByBrand");
		System.out.println("brand " + brand);
		
		ListIterator<CosmeticDTO> listIterator = cosmeticDTOs.listIterator();
		while (listIterator.hasNext()) {
			CosmeticDTO next = listIterator.next();
			if (next.getBrand().equals(brand)) {
				listIterator.remove();
				return true;
			}
			
		}
		return false;
	}

	@Override
	public void deleteAll() {
		System.out.println("deleting All");
		this.cosmeticDTOs.clear();
		

	}

	@Override
	public List<CosmeticDTO> getAll() {
		
		return this.cosmeticDTOs;
	}

	@Override
	public int totalSize() {
		
		return this.cosmeticDTOs.size();
	}

}
