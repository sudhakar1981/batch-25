/*welcome to git class 25*/
package com.selenium;

public class Abstract {

	public static void main(String[] args) {
		A x=new B();
		System.out.println(x instanceof A);
		System.out.println(x instanceof B);
		x.m1();//why it is displaying B class method?
		x.m2();//why it is displaying A class method?

	}

}

abstract class A{
	abstract void m1();
	void m2(){
		System.out.println("m1() in class A");
	}
}

class B extends A{
	void m1(){
		System.out.println("m1() in Class B");
	}
}
