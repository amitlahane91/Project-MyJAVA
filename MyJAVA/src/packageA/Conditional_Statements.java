package packageA;

public class Conditional_Statements {
public static void main(String[] args) {
	
	
	int a=5, b=6, c=2, d=9;
	
	//AND operator
	System.out.println((a<b) && (d>a));  //true
	System.out.println((d<a) && (c>b));  //false
	
	//OR operator
	System.out.println((b>a) || (d>c));  //true
	System.out.println((c>d) || (a>b));  //false
	
	//NOT operator
	System.out.println(!(a>d));  //true
	System.out.println(!(c<b));  //false

	
	int z=20;
	
	if(z >=35){
		
		System.out.println("student is pass");
	}
	else {
		System.out.println("student is fail");
	}
	 String USERNAME= "amit1991";
	 String PASSWORD= "Lahane@91";
	 
	 if (USERNAME == "amit1991") {System.out.println("correct username-login successfull");}
	 else {System.out.println("invalid username");}
		 
	
}
}
