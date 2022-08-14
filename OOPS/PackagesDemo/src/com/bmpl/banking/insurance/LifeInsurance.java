package com.bmpl.banking.insurance;

import com.bmpl.banking.users.Customers;

public class LifeInsurance extends Customers {
	public void insurance() {
		System.out.println(name);
		// we can access protected variable using inheritance
		System.out.println(acc_no);
		// System.out.println(phone);
		
		// Customers obj = new Customers();
		// acc_no is protected so we cannot access
		// System.out.println(obj.acc_no);
		// phone no is default so we cannot access
		// System.out.println(obj.phone);
	}
}
