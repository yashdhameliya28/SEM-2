import java.util.Scanner;
public class CircleArea{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter circle radius");
		float r=sc.nextFloat();
		double a=3.14*(r*r);
		System.out.println(a);
	}
}