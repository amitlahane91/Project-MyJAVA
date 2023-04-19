package Array;

/*public class Swapping {
	
	public static void main(String[] args) {
		
		int a[]= {12,56,32,46,79,92};
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		
		for(int k=0; k<(a.length/2); k++) {
			int z;
			z=a[k];
			a[k]=a[(a.length-1)-k];
			a[(a.length-1)-k]=z;
			
		}
		System.out.println();
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
	}*/
	public class swap{
		
	
	public static void main(String[] args) {
		
		int b[]= {0,1,2,3,5,6};
		for(int x=0; x<b.length; x++) {
			System.out.print(b[x]+",");
		}
		for(int x=0; x<(b.length/2); x++) {
			int j=b[x];
			b[x]=b[(b.length-1)-x];
			b[(b.length-1)-x]=j;
			
		}
		System.out.println();
		for(int x=0; x<b.length;x++) {
			System.out.print(b[x]+",");
		}
	}

}
