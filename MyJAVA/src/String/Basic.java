 package String;

public class Basic {
	
	public static void main(String[] args) {
		
		String a1 = "velocity";
		String a2 = "VELOCITY";
		String a3 = "CITY";
		String a4 = "velo";
		String a5 = "";
		String x = "amit lahane aurangabad";
		String y = "  amit lahane aurangabad      ";
		
		
		System.out.println(a1.substring(2, 5));
		System.out.println(a1.charAt(5));
		System.out.println(a1.concat(a3));
		System.out.println(a5.isEmpty());
		System.out.println(a1.endsWith("ty"));
		System.out.println(a1.startsWith(a4));
		System.out.println(a1.indexOf("l"));
		System.out.println(a2.lastIndexOf("O"));
		System.out.println(a2.contains(a3));
		System.out.println(a2.length());
		System.out.println(a2.equals(a4));
		System.out.println(a1.equalsIgnoreCase(a2));
		System.out.println(a4.toUpperCase());
		System.out.println(x.trim());
		System.out.println(y.trim());
	}

}
