import java.util.Scanner;
public class Mark1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark for m1");
		int m1=sc.nextInt();
		System.out.println("Enter mark for m2");
		int m2=sc.nextInt();
		System.out.println("Enter mark for m3");
		int m3=sc.nextInt();
		System.out.println("Enter mark for m4");
		int m4=sc.nextInt();
		System.out.println("Enter mark for m5");
		int m5=sc.nextInt();
		float p=(m1+m2+m3+m4+m5)/5;
		if(p>=60){
			System.out.println("first division");
		}else if(p>=50){
			System.out.println("second division");
		}else if(p>=40){
			System.out.println("third division");
		}else{
			System.out.println("fail !!!!!");
		}
	}
}