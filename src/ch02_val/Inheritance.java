package ch02_val;

class Parent {
	int x = 10;
	
	Parent(int a){
		
	}
}

class Child extends Parent {
	int x = 20;
	
	Child(){
		super(10);
		
	}
		
}

class GrandChild extends Child {
	int x = 30;
	
}

public class Inheritance {
	public static void main(String[] args) {

		
	}

}
