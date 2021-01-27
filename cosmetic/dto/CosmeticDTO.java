package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.Cosmeticshades;

import java.util.Objects;

import com.xworkz.cosmetic.constants.CosmeticType;


public class CosmeticDTO {

	private String brand;
	private Cosmeticshades Shades;
	private CosmeticType Type;
	private int price;
	private int quantity;

	public CosmeticDTO() {

	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", Shades=" + Shades + ", Type=" + Type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	/**
	 * @param brand
	 * @param shades
	 * @param type
	 * @param price
	 * @param quantity
	 */
	public CosmeticDTO(String brand, Cosmeticshades shades, CosmeticType type, int price, int quantity) {
		super();
		this.brand = brand;
		Shades = shades;
		Type = type;
		this.price = price;
		this.quantity = quantity;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(Shades, Type, brand, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals");
		if (obj != null)
			return false;
		if (!(obj instanceof CosmeticDTO))
			return false;
		CosmeticDTO casted = (CosmeticDTO) obj;
		if (this.brand!=null&& this.Type!=null) {
			
		if (this.brand.equals(casted.brand)&& this.Type.equals(casted.Type)){
			System.out.println("equals is invoked");
			
		}
		}
		return true;
	}

	public String getBrand() {
		return brand;
	}

	public Cosmeticshades getShades() {
		return Shades;
	}

	public CosmeticType getType() {
		return Type;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setShades(Cosmeticshades shades) {
		Shades = shades;
	}

	public void setType(CosmeticType type) {
		Type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
