package LogicalPrograms;

public class StarProgram {
     public static void main(String[] args) {
		
    	for(int a=1; a<=4; a++) {
    		
    		for(int b=1; b<=4; b++) {System.out.print("*");
    		}
    		System.out.println();
    		}
    	System.out.println("pattern 1");
    	
    	// other loop
    	for(int c=1; c<=4; c++) {
    		for(int d=1; d<=c; d++) {System.out.print("*");}
    		System.out.println();
    	}
    	System.out.println("pattern 2");
    	
    	//other loop
    	for(int e=1; e<=4; e++) {
    		for(int f=4; f>=e; f--) {System.out.print("*");}
           System.out.println();
    	}
    	System.out.println("pattern 3");
    	
    	//other loop
    	for(int g=1; g<=4; g++) {
    		for(int h=4; h>g; h--) {System.out.print(" ");}
    		for(int i=1; i<=g; i++) {System.out.print("*");}
    		System.out.println();
    	}
    	System.out.println("pattern 4");
    	
    	//other loop
    	for(int j=1; j<=4; j++) {
    		for(int k=1; k<j; k++) {System.out.print(" ");}
    		for(int l=4; l>=j; l--) {System.out.print("*");}
    		System.out.println();
    	}
    	System.out.println("pattern 5");
    	//other loop
    	int space=4;
		int star=1;
		for(int a=1; a<=9; a++) {
			for(int b=1; b<=space; b++) {System.out.print(" ");}
			for (int c=1; c<=star; c++) {System.out.print("*");}
			System.out.println();
			if (a<=4) {
			space--;
			star=star+2;
			}
			else {
				space++;
				star=star-2;}
		}
		System.out.println("pattern 6");
    	//other loop
		int jaga=4;
		int tare=1;
		for (int a=1; a<=5; a++) {
		for (int b=1; b<=jaga; b++) {System.out.print(" ");}
		for (int c=1; c<=tare; c++) {System.out.print("*");}
		System.out.println();
		if(a<=4) {
			jaga--;
			tare=tare+2;}
		else { }  
		
}     	 
		System.out.println("pattern 7");
		//other loop
		int stara=1;
		int spacea=1;
		for (int a=1; a<=9; a++) {
		for (int b=1; b<=stara; b++) {System.out.print("*");}
		for (int c=1; c<=spacea; c++) {System.out.print(" ");}
		System.out.println();
		if(a<=4) {
			stara++;
			spacea--;}
		else {
			stara--;
			spacea++;}
		}
		System.out.println("pattern 8");
		//other loop
		int spaceb=4;
		int starb=1;
		for (int a=1; a<=9; a++) {
		for (int b=1; b<=spaceb; b++) {System.out.print(" ");}
		for (int c=1; c<=starb; c++) {System.out.print("*");}
		System.out.println();
		if(a>=5) {
			spaceb++;
			starb--;}
		else {
			spaceb--;
			starb++;}
		}
		System.out.println("pattern 9");
		//other loop
		int spacec=4;
		int starc=5;
		for (int a=1; a<=5; a++) {
		for (int b=1; b<=spacec; b++) {System.out.print(" ");}
		for (int c=1; c<=starc; c++) {System.out.print("*");}
		System.out.println();
		if(a<=5) {
			spacec--;}
			}
		System.out.println("pattern 10");
		//other loop
		int stard=5;
		int spaced=1;
		for (int a=1; a<=5; a++) {
		for (int b=1; b<=stard; b++) {System.out.print("*");}
		System.out.println();
		for (int c=1; c<=spaced; c++) {System.out.print(" ");}
		if(a<=4) {
			spaced++;}
			}
		System.out.println("pattern 11");
		//other loop
		int stare=5;
		int spacee=1;
		for (int a=1; a<=9; a++) {
		for (int b=1; b<=stare; b++) {System.out.print("*");}
		for (int c=1; c<=spacee; c++) {System.out.print(" ");}
		System.out.println();
		if(a<=4) {
			stare--;}
		else {stare++;}
		}
		System.out.println("pattern 12");
		//other loop
		int starf=5;
		int spacef=0;
		for (int a=1; a<=9; a++) {
		for (int b=1; b<=spacef; b++) {System.out.print(" ");}
		for (int c=1; c<=starf; c++) {System.out.print("*");}
		System.out.println();
		if(a<=4) {
			spacef++;
			starf--;}
		else {spacef--;
		starf++;}
		} 
		System.out.println("pattern 13");
		//other loop
		int starg=9;
		int spaceg=0;
		for (int a=1; a<=5; a++) {
		for (int b=1; b<=spaceg; b++) {System.out.print(" ");}
		for (int c=1; c<=starg; c++) {System.out.print("*");}
		System.out.println();
		if(a<=4) {
			spaceg++;
			starg=starg-2;}
		}
		System.out.println("pattern 14");
		//other loop
		int starh=9;
		int spaceh=0;
		for (int a=1; a<=9; a++) {
		for (int b=1; b<=spaceh; b++) {System.out.print(" ");}
		for (int c=1; c<=starh; c++) {System.out.print("*");}
		System.out.println();
		if(a<=4) {
			spaceh++;
			starh=starh-2;}
		else {
			spaceh--;
			starh=starh+2;}
		}
 
}
}
