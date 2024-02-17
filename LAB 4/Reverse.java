import java.util.Scanner;
public class Reverse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int l = str.length();
		System.out.println("String length:"+l);
		for(int i=l/2; i<l; i++){
			System.out.println(str.charAt(i));
		} 
	}
}