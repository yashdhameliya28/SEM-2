import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt(),r,a1,b=0;
		a1=a;
		while(a!=0){
			r=a%10;
			b=b*10+r;
			a=a/10;

		}
		if(a1==b){
			System.out.println("number is Palindrome");
		}else{
			System.out.println("number is not Palindrome");
		}
	}
}