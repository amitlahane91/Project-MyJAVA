package MultipleInterface;

public class Model implements Bike,Car {
    
	public void Hero() {
		System.out.println("splendor");
	}
	public void Honda() {
		System.out.println("shine");
	}
	public void Bajaj() {
		System.out.println("pulser");
	}
	public void Tvs() {
		System.out.println("apache");
	}
    public void Mahindra() {
    	System.out.println("scorpio");
    }
	public void Tata() {
		System.out.println("safari");
	}
	public void Hyundai() {
		System.out.println("i20");
	}
	public void Maruti() {
		System.out.println("ertiga");
	}
	public static void main(String[] args) {
		Model m = new Model();
		m.Hero();
		m.Honda();
		m.Bajaj();
		m.Tvs();
		m.Mahindra();
		m.Tata();
		m.Hyundai();
		m.Maruti();
	}

}
