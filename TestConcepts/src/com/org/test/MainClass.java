package com.org.test;

import java.util.SortedSet;
import java.util.TreeSet;

//import sun.jvm.hotspot.ui.table.SortableTableModel;

public class MainClass {
	
	public static void main(String[] args) {
		
		Week var = Week.MONDAY;
		
		if(var == Week.MONDAY)
		{
			System.out.println("Its a Monday");
		}
		else if(var == Week.TUESDAY)
		{
			System.out.println("Its a Tuesday");
		}
		else if(var == Week.WEDNESDAY)
		{
			System.out.println("Its a Wednesday");
		}
		else if(var == Week.THURSDAY)
		{
			System.out.println("Its a Thursday");
		}
		else if(var == Week.FRIDAY)
		{
			System.out.println("Its a friday");
		}
		
		SortedSet<String>fruits = new TreeSet<String>();
		
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("tomato");
		fruits.add("grapes");
		fruits.add("kiwi");
		fruits.add("pineapple");
		fruits.add("avacado");
		fruits.add("strawberry");
		
		System.out.println("fruits are:");
		for (String str : fruits) {
			System.out.print(str+" ");
		}
		
//		System.out.println(fruits);
	}

//	String arr[] = {"banana","apple","tomato","grapes","oranges"};
	
	
}
