package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleData {
	
	@Test(dataProvider = "data")
	public void addProduct(String productId, String productName, int quantity) {
		
		System.out.println("Product Id : "+productId+" Product Name : "+productName+" Product Quantity: "+quantity);
	}
	
	@DataProvider
	public Object[][] data() {
		
		Object [][] arr = new Object[4][3];
		
		arr[0][0]="F001";
		arr[1][0]="F002";
		arr[2][0]="F003";
		arr[3][0]="F004";
		
		arr[0][1]="Iphone";
		arr[1][1]="TV";
		arr[2][1]="Washing Machine";
		arr[3][1]="Laptop";
		
		arr[0][2]=2;
		arr[1][2]=1;
		arr[2][2]=1;
		arr[3][2]=5;
		
		return arr;

	}
	
	

}
