import java.util.Scanner;
public class Convert{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fahrenheit");
		float f=sc.nextFloat();
		double c=f-32*5/9;
		System.out.println(c);
	}
}