package com;

import org.testng.annotations.Test;

public class A {
	@Test(priority=-200)
	private void tc1() {
		// TODO Auto-generated method stub

	}
	@Test(priority=-300,invocationCount=4)
	private void tc2() {
		// TODO Auto-generated method stub

	}
	@Test(priority=100)
	private void tc3() {
		// TODO Auto-generated method stub

	}
	@Test(priority=25)
	private void tc4() {
		// TODO Auto-generated method stub

	}
	@Test(enabled=false)
	private void tc5() {
		// TODO Auto-generated method stub

	}

}
