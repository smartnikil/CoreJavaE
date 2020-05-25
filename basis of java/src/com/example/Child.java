package com.example;
class Parent
{
	  public Parent() {
		System.out.println("Parent default constructor");
	 }
	  public Parent(int i){
		 System.out.println("parent parameterized constructor");
	 }
}

public class Child extends Parent {

	public Child() {
		System.out.println(" child default constructor");
	}
	public Child(int i)
	{
	 System.out.println("child parameterized constructor");
		
	}
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Child();
		Parent p1 = new Parent();
		Child c1 = new Child(10);
		Parent p2 = new Parent(10);
		//Child c = new Parent();(throws error cannot convert from parent to child)
	}

}
