package inter;

public class A implements Inter {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);
		int x = 20;
		System.out.println(a.x);
	}
}
