package com.cisc181.core;
import static org.junit.Assert.*;

import com.cisc181.eNums.eTitle;


import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		
		ArrayList<Staff> Staff = new ArrayList<Staff>();
		
		Staff TIM = new Staff(eTitle.MR);
		Staff MIKE = new Staff(eTitle.MR);
		Staff KATE = new Staff(eTitle.MRS);
		Staff JAMES = new Staff(eTitle.MR);
		Staff ERIC = new Staff(eTitle.MR);

		TIM.setSalary(98300.00);
		MIKE.setSalary(133000.00);
		KATE.setSalary(30000.00);
		JAMES.setSalary(97000.00);
		ERIC.setSalary(98000.00);
	}	
	
	public void DateOfBirthTEST() throws PersonException{
		
	}
	
	public void PhoneTEST() throws PersonException{
		
	}

}
