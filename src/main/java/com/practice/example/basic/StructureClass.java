package com.practice.example.basic;

public class StructureClass {
	//Instant Variable
	public int a=100;
	public String str;

	//Non Static Block
	{
		System.out.println("Calling Non Static Block");
	}

	//Static Block
	static {
		System.out.println("Calling Static Block");
	}

	public StructureClass(){
		System.out.println("calling Constructor");
	}

	//Parametrized Constructor
	public StructureClass(int a){
		System.out.println("Calling Parametrized Constructor");
		this.a = a;
	}

	public StructureClass(int a, String str){
		System.out.println("Calling Overloaded Constructor");
		this.a = a;
		this.str = str;
	}

	//Method without return
	public void method1(){
		System.out.println(str);
	}

	//Method with Return Value
	public int method2(){
		return a;
	}
	public int method3(int a){
		return this.a*a;
	}
	public String method4(String str){
		return this.str+" "+str;
	}

}