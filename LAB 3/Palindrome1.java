import java.util.Scanner;
public class Palindrome1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sting");
		String s=sc.next();
		int n=s.length()-1;
		boolean pali = true;
		for(int i=0 ; i<s.length() ; i++){
			if(s.charAt(i)!=s.charAt(n-i)){
				pali=false;
				break;
			}
		}
		if(pali){
			System.out.println("string is Palindrome");
		}else{
			System.out.println("string is not Palindrome ");
		}
	}
}