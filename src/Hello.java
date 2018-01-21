
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Charly");
		Hello hello=new Hello();
		int h1=hello.additionner(10,8);
		int h2=hello.soustraire(10,8);
		System.out.println(h1);
		System.out.println(h2);

	}
	
	public int additionner(int a, int b){
		return a+b;
	}
	
	public int soustraire(int a, int b){
		return a-b;
	}

}
