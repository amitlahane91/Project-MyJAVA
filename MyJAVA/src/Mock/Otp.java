package Mock;

import java.util.Random;

public class Otp {
	
	static char[] OTP(int len) {
		System.out.println("Your OTP is:" );
		String numbers="0123456789";
		Random rnd = new Random();
		char[] otp = new char[len];
		
		for(int i=0; i<len; i++) {
			otp[i]=numbers.charAt(rnd.nextInt(len));
		}
		return otp;
	}
	
	public static void main(String[] args) {
		
		int length = 4;
		System.out.println(OTP(length));
	}

}
