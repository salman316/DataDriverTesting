package com.excel.util.lib;

import java.util.ArrayList;

public class TestUtil {

	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()  {
	
	ArrayList<Object[]>mydata = new ArrayList<Object[]>();	
	
	try {
		reader = new Xls_Reader("C:\\Users\\sshai\\Videos\\VELOCITY CHINCHWAD\\ExcellSheet\\HalfEbayTestData.xlsx");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	for(int rowNum = 2; rowNum<=reader.getRowCount("RegisTestData")-1; rowNum++) {
	
	String firstname =reader.getCellData("RegisTestData", "firstname", rowNum);
	String LastName =reader.getCellData("RegisTestData", "LastName", rowNum);
	String Email =reader.getCellData("RegisTestData", "Email", rowNum);
	String PanNo =reader.getCellData("RegisTestData", "PanNo", rowNum);
	
	
	Object ob[]= {firstname, LastName, Email, PanNo};
	mydata.add(ob);
	
	
	
	}
	return mydata;
}
}