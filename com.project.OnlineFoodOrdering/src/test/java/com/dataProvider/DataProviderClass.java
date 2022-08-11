package com.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	@Test(dataProvider = "dataprovider")
	public void accepter(String name, String place) {
		System.out.println("Name: "+name+ "Place: "+place);
	}
	
	@DataProvider
	public Object[][] dataprovider(){
		Object[][] objArry = new Object[3][2];
		objArry[0][0]="nithin";
		objArry[0][1]="davangere";
		objArry[1][0]="nanda";
		objArry[1][1]="Bangaluru";
		objArry[2][0]="nithin";
		objArry[2][1]="davangere";
		return objArry;
		
	}

}
