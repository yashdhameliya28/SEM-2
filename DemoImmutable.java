public class DemoImmutable{
	public static int a=20;
	public static void main(String[] args) {
		int c = addImmutable(10);
		System.out.println(c);
		System.out.println(a);
	}
	public static void addImmutable(int b){
		a=a+b;
	}
	public static int addImmutable(int b){
		return a+b;
	}
}