package com.rakuten.training.basics;

public class StackUser {
	
	public void fill(Stack s) {
		for(int i=0;i<10;i++) {
			s.push(i);
			System.out.println("Pushed ----> "+i);
						
		}
		
//		Integer iObj = 10; // new Integer(10);
//		iObj++; // iObj = new Integer(iObj.intValue()++);
//		int j = iObj; // iObj.intValue();
	}

}

