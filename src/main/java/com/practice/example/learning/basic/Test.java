package com.practice.example.learning.basic;

public class Test{
	public static void main(String args[]){
		StructureClass b = new StructureClass();//Default Constructor
		StructureClass b1 = new StructureClass(12);//Parametrized
		StructureClass b2 = new StructureClass(10,"Neha");//OverLoaded constructor
		System.out.println(b.a+"----"+b.str);
		System.out.println(b1.a+"----"+b1.str);
		System.out.println(b2.a+"----"+b2.str);

		b2.method1();
		System.out.println(b2.method2());
		System.out.println(b2.method3(15));
		System.out.println(b2.method4("Welcome"));

	}
}