package com.org.inheritance;

import java.util.LinkedList;
import java.util.List;

//import com.sun.tools.javac.util.List;

public class MainClass  {

	public void testMethod()
	{
		System.out.println("test1............");
	}
//	public MainClass(int test) {
//		
////		super();
//		
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		
		
		User user = new Admin();
		
		user.userMethod();
		
		user = new Viewer();
		user.userMethod();
		
		
		user = new Editor();
		user.userMethod();
		
		user.commonAttributeOne();
		
//		try {
//			
//		}finally {
//			
//		}
		
//		MainClass main = new MainClass(50);
		
		List<Integer>list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(7);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
//		System.out.println(list.get(2));
		
		for (int i : list) {
//	System.out.println(i);		
			if(i == 3)
			{
				System.out.println(i+" "+list.get(i));
			}
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			
			if(list.get(i) == 3)
			{
				System.out.println(i+" "+list.get(i));
			}
		}
		
	}
}
