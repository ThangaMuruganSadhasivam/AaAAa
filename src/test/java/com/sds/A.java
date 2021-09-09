package com.sds;

import org.testng.annotations.DataProvider;

public class A {

	@DataProvider(name="testdata")
	public Object[][] tc0() {
		return new Object[][] {
			{"Iphone"},{"samsung"},{"airpods"},{"mi"},{"toys"}
		};

	}
}
