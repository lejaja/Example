
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Charly");
		Hello hello=new Hello();
		int h1=hello.additionner(10,8);
		int h2=hello.soustraire(10,8);
		System.out.println(h1);
		System.out.println(h2);
		
		Multiplier multiplier= new Multiplier();
		int m1=multiplier.multiplication(10, 11);
		System.out.println(m1);
		
		Diviser diviser= new Diviser();
		int d1=diviser.division(10, 5);
		System.out.println(d1);

	}
	
	public int additionner(int a, int b){
		return a+b;
	}
	
	public int soustraire(int a, int b){
		return a-b;
	}

}
