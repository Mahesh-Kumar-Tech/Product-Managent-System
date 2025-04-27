package test;

import java.io.*;
@SuppressWarnings("serial")
public class ProductBean implements Serializable{
	private String pCode;
	private String pName;
	private double pPrice;
	private long pStock;
	
	public ProductBean() {
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	public long getpStock() {
		return pStock;
	}

	public void setpStock(long pStock) {
		this.pStock = pStock;
	}
	

}
