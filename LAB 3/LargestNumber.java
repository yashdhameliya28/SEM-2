import java.util.Scanner;
	public class LargestNumber{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
			int b=sc.nextInt();
			System.out.println("Enter third number");
			int c=sc.nextInt();
			if(a>b){
				if(a>c){
					System.out.println("first is LargestNumber");
				}
			}else{
				if(b>c){
					System.out.println("second is LargestNumber");
				}else{
					System.out.println("third is LargestNumber");
				}
			}
		}
	}