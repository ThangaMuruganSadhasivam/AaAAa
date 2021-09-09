package com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class D {

	@BeforeMethod
	private void tc0() {
		System.out.println("Tc0-@BeforeMethod");

	}
	@Test
	private void tc1() {
		System.out.println("Tc1-@test");

	}
	@BeforeClass
	private void tc2() {
		System.out.println("Tc2-@BeforeClass");

	}
	@AfterClass
	private void tc3() {
		System.out.println("Tc3-@AfterClass");

	}
	
	@AfterSuite
	private void tc5() {
		System.out.println("Tc5-@AfterSuite");

	}
	@BeforeSuite
	private void tc6() {
		System.out.println("Tc6-@BeforeSuite");

	}
}
