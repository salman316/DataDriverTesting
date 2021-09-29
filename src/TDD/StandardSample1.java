package TDD;

import com.excel.util.lib.Xls_Reader;

public class StandardSample1 {
	
	public static void main(String[] args) {
		
	Xls_Reader reader = new Xls_Reader ("C:\\Users\\sshai\\Videos\\VELOCITY CHINCHWAD\\ExcellSheet\\HalfEbayTestData.xlsx");
	
	String fname = reader.getCellData("RegisTestData", "firstname", 2);
	System.out.println(fname);
	
	String lname = reader.getCellData("RegisTestData", "LastName", 2);
	System.out.println(lname);
	
	String emailid = reader.getCellData("RegisTestData", "Email", 2);
    System.out.println(emailid);
    
    String paswrd = reader.getCellData("RegisTestData", "Password", 2);
    System.out.println(paswrd);
	}

}
