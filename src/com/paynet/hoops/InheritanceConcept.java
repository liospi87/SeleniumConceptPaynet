package com.paynet.hoops;

class Father
{
	public void fatherStyle()
	{
		System.out.println("fatherStyle");
	}
	}

class Child extends Father
{
	public void childStyle()
	{
	System.out.println("childStyle");
}
}
public class InheritanceConcept {

	public static void main(String[] args) {
		
		Child cObj=new Child();
				cObj.fatherStyle();
		cObj.childStyle();
		// TODO Auto-generated method stub
	}

}
