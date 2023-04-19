package practice;

public interface Two {
	
	default void sub() {
		int i=60;
		int j=10;
		int k=i-j;
		System.out.println(k);
	}
	
	public void laptop();
	
    public void desktop();
	
}
