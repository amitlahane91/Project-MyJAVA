package MethodConstructor;

public class constructor {
	int a;
	int b;
	int m;
	String name;
	String lahane;
	
	 constructor(){  //user define const with zero argument
		a=50;
		b=70;
	}
	constructor(int c, int d){  //user define const with argument
		a=c;
		b=d;
	}
	constructor(int c,int d,int i){  //user define with argument
		a=c;
		b=d;
		m=i;
		System.out.println(b);
		System.out.println("abcd");
	}
	constructor(String name, String lahane){//user define with argument
	}
	public void addition() { //non static method
		System.out.println(m+a+b);
	}
	public void work() {
		System.out.println("name");
		System.out.println("lahane");
	}
	public static void main(String[] args) {
		constructor t = new constructor();
		t.addition();
		t.work();
		
		constructor t1 = new constructor(50,300);
		t1.addition();
		
		constructor t2 = new constructor(500,20,10);
	 	t2.addition();
	}

}
