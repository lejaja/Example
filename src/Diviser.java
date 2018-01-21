
public class Diviser {

	private int a;
	private int b;
	public Diviser(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}	
	
	public Diviser() {
		super();
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	 
	public int division(int a, int b){
		return a/b;
	}
}
