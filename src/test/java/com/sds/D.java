package com.sds;

import org.testng.annotations.DataProvider;

public class D {
	@DataProvider(name="testdata")
	public Object[][] tc1() {
		return new Object[][]
				{
			{"Iphone"},{"Samsung"},{"nokia"},{"apple"},{"toys"}
			
				};

	}

}
